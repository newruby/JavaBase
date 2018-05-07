package com.ty.com.base.ObjectOriented.singleton;

/**
 * created by TY on 2018/5/7.
 */

/**
 *  单例模式
 *  饿汉式示例：在类加载阶段就创建了对象实例
 */
public class Customer {

    private static Customer c = new Customer();

    private Customer() {}

    public static Customer getInstance() {
        return c;
    }

}

