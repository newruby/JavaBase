package com.ty.com.base.ObjectOriented.inherit;

/**
 * created by TY on 2018/5/8.
 */

/**
 * 静态方法不存在覆盖
 * @param
 * @return
 */
public class OverrideTest3 {
    public static void main(String[] args) {
        A a = new B();

        //静态方法不存在覆盖 静态方法的执行与对象无关

        a.m1();//A'm1 method invoke!

        A.m1();//A'm1 method invoke!
        B.m1();//B'm1 method invoke!

    }
}

class A {
    //静态方法
    public static void m1() {
        System.out.println("A'm1 method invoke!");
    }
}
class B extends A {
    //尝试重写父类的静态方法
    public static void m1() {
        System.out.println("B'm1 method invoke!");
    }
}


