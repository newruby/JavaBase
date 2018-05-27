package com.ty.com.base.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * created by TY on 2018/5/27.
 */
public class ConstructorMethodReflectTest {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("java.lang.String");

        Constructor[] cs = c.getDeclaredConstructors();

        for(Constructor con : cs) {
            System.out.println(Modifier.toString(con.getModifiers()));

//            System.out.println(c.getName());
            System.out.println(con.getName());

            Class[] parameterTypes = con.getParameterTypes();
            for(Class parameterType: parameterTypes) {
                System.out.println(parameterType.getSimpleName());
            }
        }

    }
}

/*
public
java.lang.String
        byte[]
        int
        int
public
java.lang.String
        byte[]
        Charset
public
java.lang.String
        byte[]
        String
public
java.lang.String
        byte[]
        int
        int
        Charset
public
java.lang.String
        byte[]
        int
        int
        String

        java.lang.String
        char[]
        boolean
public
java.lang.String
        StringBuilder
public
java.lang.String
        StringBuffer
public
java.lang.String
        byte[]
public
java.lang.String
        int[]
        int
        int
public
java.lang.String
public
java.lang.String
        char[]
public
java.lang.String
        String
public
java.lang.String
        char[]
        int
        int
public
java.lang.String
        byte[]
        int
public
java.lang.String
        byte[]
        int
        int
        int */
