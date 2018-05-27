package com.ty.com.base.reflect;

/**
 * created by TY on 2018/5/27.
 */

import java.util.Date;

/**
 * 获取Class类型对象的三种方式
 * @param
 * @return
 */
public class ReflecTest1 {
    public static void main(String[] args) throws Exception {
        //1.
        Class c1 = Class.forName("com.ty.com.base.reflect.Employee");

        //2.
        Class c2 = Employee.class;

        //3.
        Employee e = new Employee();
        Class c3 = e.getClass();

        System.out.println(c1 == c2);
        System.out.println(c3 == c2);

        //full name
        Class c4 = Class.forName("java.util.Date");

        //2.
        Class c5 = Date.class;

        //3.
        Date d = new Date();
        Class c6 = d.getClass();

        System.out.println(c4 == c5);
        System.out.println(c5 == c6);
    }
}
        /*
        true
        true
        true
        true */
