package com.ty.com.base.reflect;

/**
 * created by TY on 2018/5/27.
 */

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 获取Class类型的对象之后可以创建该类的对象
 * @param
 * @return
 */
public class ReflecTest3 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.ty.com.base.reflect.Employee");

        Object o = c.newInstance();
        System.out.println(o);

        Class c1 = Class.forName("java.util.Date");
        Object o1 = c1.newInstance();

        if(o1 instanceof Date) {
            Date date = (Date)o1;
            System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(date));
        }
    }
}

/*
        Employee无参数的构造方法
        com.ty.com.base.reflect.Employee@1540e19d
        2018-05-27 09:34:25 276*/
