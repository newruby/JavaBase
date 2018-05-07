package com.ty.com.base.ObjectOriented.singleton;

/**
 * created by TY on 2018/5/7.
 */
/**
 *  单例模式
 *  懒汉式示例：用到对象时才会创建
 */
public class Singleton {
    //3.提供一个当前类型的静态变量

    private static Singleton s;
    //1.将构造方法私有化
    private Singleton() {}

    //2.对外提供一个公开的静态的获取当前类型对象的方法
    public static Singleton getInstance() {
        if(s == null) {
            s = new Singleton();
        }
        return s;
    }
}

