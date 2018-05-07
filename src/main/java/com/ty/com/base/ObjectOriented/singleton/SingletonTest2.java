package com.ty.com.base.ObjectOriented.singleton;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * created by TY on 2018/5/7.
 */

/**
 *  单例模式
 *  饿汉式示例：在类加载阶段就创建了对象实例
 *  Customer.java
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Customer c1 = Customer.getInstance();
        Customer c2 = Customer.getInstance();

        System.out.println(c1 == c2);
    }

}
