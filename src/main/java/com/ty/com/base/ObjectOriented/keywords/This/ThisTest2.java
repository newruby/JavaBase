package com.ty.com.base.ObjectOriented.keywords.This;

/**
 * created by TY on 2018/5/6.
 */
/**
 this 关键字
 this 可以用来区分成员变量和局部变量
*/
public class ThisTest2 {
    public static void main(String[] args) {
        Manager m1 = new Manager("TY");
        Manager m2 = new Manager();
        m2.setName("DY");

        System.out.println(m1.getName());//TY
        System.out.println(m2.getName());//DY

    }

}
class Manager {
    private String name;

    Manager() {}

    Manager(String name) {
        this.name = name;
    }

    //成员方法
    public void setName(String name) {
        //成员变量this.name 局部变量name
        this.name = name;

    }
    //成员方法
    public String getName() {
        return name;//return this.name;
    }
}
