package com.ty.com.base.ObjectOriented.keywords.Final;

/**
 * created by TY on 2018/5/10.
 */
public class FinalTest2 {
    public static void main(String[] args) {
        final Customer c = new Customer("TY", 22);
        //final修饰的引用类型不可再重新指向其他对象
        //但该引用指向对象的属性是可以修改
        /*c = new Customer("DY", 21);  */
        c.age = 23;
        System.out.println(c.name);
        System.out.println(c.age);
    }

}

class Customer {
    String name;
    int age;

    Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

/*
TY
23
*/