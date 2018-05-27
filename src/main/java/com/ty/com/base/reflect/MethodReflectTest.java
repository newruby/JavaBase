package com.ty.com.base.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * created by TY on 2018/5/27.
 */
public class MethodReflectTest {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("com.ty.com.base.reflect.CustomerService");

        Method[] methods = c.getDeclaredMethods();

        for(Method method: methods) {
            System.out.println(Modifier.toString(method.getModifiers()));

            Class returnType = method.getReturnType();
            System.out.println(returnType.getSimpleName());

            System.out.println(method.getName());

            Class[] parameterTypes = method.getParameterTypes();
            for(Class parameterType: parameterTypes) {
                System.out.println(parameterType.getSimpleName());
            }
        }
    }
}

/*  public
    boolean
            login
    String
            String
    public
    void
            logout*/