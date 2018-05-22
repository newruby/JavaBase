package com.ty.com.base.collection;

/**
 * created by TY on 2018/5/21.
 */
public class Employee {
    String no;

    String name;

    Employee(String no, String name) {
        this.no = no;
        this.name = name;
    }

    //重写equals方法
    @Override
    public boolean equals(Object o) {
        if(this == o) {return true;}
        if(o instanceof Employee) {
            Employee e = (Employee) o;
            if((e.no).equals(this.no) && (e.name).equals(this.name)) {
                return true;
            }
        }
        return false;
    }
    //重写hasCode方法
    @Override
    public int hashCode() {
        //以员工编号分组
        return no.hashCode();
    }

}
