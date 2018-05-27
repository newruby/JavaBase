package com.ty.com.base.reflect;

import java.lang.reflect.Constructor;

/**
 * created by TY on 2018/5/27.
 */
public class ConstructorMethodReflectTest2 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.ty.com.base.reflect.Customer");


        Constructor con = c.getDeclaredConstructor(String.class, int.class);

        Object o = con.newInstance("TY", 23);

        System.out.println(o);
    }
}

/*customer [TY 23]*/