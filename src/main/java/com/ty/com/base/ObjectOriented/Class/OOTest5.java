package com.ty.com.base.ObjectOriented.Class;

/**
 * created by TY on 2018/5/6.
 */

/*程序在执行过程中，参数的传递问题
* 1.传递的数据是基本数据类型
* 2.传递的数据是引用数据类型
*/

//传递引用数据类型程序
public class OOTest5 {
    public static void m1(Animal a) {
        a.age++;
        System.out.println("m1----->" + a.age);
    }

    public static void main(String[] args) {
        //创建animal对象
        Animal a = new Animal(10);

        m1(a);//11

        System.out.println("main--------->" + a.age);//11!!!

    }
}

class Animal {
    int age;

    //Constructor
    Animal(int _age) {
        age = _age;
    }
}
