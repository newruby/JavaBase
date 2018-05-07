package com.ty.com.base.ObjectOriented.singleton;

/**
 * created by TY on 2018/5/7.
 */

/**
 *  单例模式
 *  懒汉式示例：用到对象时才会创建
 *  Singleton.java
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);//true
    }
}
