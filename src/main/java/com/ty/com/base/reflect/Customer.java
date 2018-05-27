package com.ty.com.base.reflect;

/**
 * created by TY on 2018/5/27.
 */
public class Customer {
    String name;
    int age;

    Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "customer [" + name + " " +  age + "]";
    }
}
