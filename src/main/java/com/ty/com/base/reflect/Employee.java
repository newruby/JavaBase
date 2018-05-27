package com.ty.com.base.reflect;

/**
 * created by TY on 2018/5/27.
 */
public class Employee {
    private String name;

    public Employee() {
        System.out.println("Employee无参数的构造方法");
    }

    public Employee(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(name + " is working" );
    }

}
