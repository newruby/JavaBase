package com.ty.com.base.reflect;


/**
 * created by TY on 2018/5/27.
 */


/**
 * 获取父类和父类接口
 * @param
 * @return
 */
public class SuperClass {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("java.util.Date");

        Class superClass = c.getSuperclass();
        System.out.println(superClass.getName());

        Class[] ins = c.getInterfaces();
        for(Class in:ins) {
            System.out.println(in.getName());
        }
    }
}

        /* java.lang.Object
        java.io.Serializable
        java.lang.Cloneable
        java.lang.Comparable*/