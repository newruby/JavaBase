package com.ty.com.base.ObjectOriented.keywords.Final;

/**
 * created by TY on 2018/5/10.
 */
public class FinalTest1 {
}

/**
 * final修饰的成员变量必须显示的初始化（在构造方法调用前赋值）
 * @param
 * @return
 */

class A {
    final int i = 100;
    //or
    final int k;
    A() {
        k = 1;
    }
//    //不行
//    final int s ;
//    i =100;
//
//
    //常量大写
    public static final double PI = 3.14;
}