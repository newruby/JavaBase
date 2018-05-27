package com.ty.com.base.reflect;

import java.lang.reflect.Method;

/**
 * created by TY on 2018/5/27.
 */
public class MethodReflectTest2 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("com.ty.com.base.reflect.CustomerService");

        Method m = c.getDeclaredMethod("login", String.class, String.class);

        Object o = c.newInstance();

        Object retValue = m.invoke(o, "admin", "123");
        System.out.println(retValue);
    }
}
/*true*/