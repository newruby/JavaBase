package com.ty.com.base.ObjectOriented.keywords.Static;

/**
 * created by TY on 2018/5/7.
 */

/**
 * 静态变量（在方法区）
 */
public class StaticTest4 {
    public static void main(String[] args) {
        Animal a1 = new Animal("AAA", 10);
        Animal a2 = new Animal("BBB", 11);

//        System.out.println(a1.type);使用引用 但底层访问用的类.
        /**
         * 静态变量
         * 类.访问
         */
        System.out.println(Animal.type);
    }
}

class Animal {
    /**
     * 成员变量（一个对象一份）
     *   在创建对象的时候初始化，并且存储在堆中的每一个对象中
     */
    String name;
    int age;

    /**
     *   所有对象共用一份
     *   如果这个属性所有的对象都有，这个属性的值是相同的，则该属性声明成静态变量
     */
    static String type = "陆生";

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}