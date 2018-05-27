package com.ty.com.base.reflect;

/**
 * created by TY on 2018/5/27.
 */
public class ReflecTest2 {
    public static void main(String[] args) throws Exception{
        //将A.CLASS文件装载到JVM中的过程
        Class.forName("com.ty.com.base.reflect.A");

        //不会执行static
        Class c = A.class;
    }
}

class A {
    static {
        System.out.println("A....");
    }
}

/*
A....*/
