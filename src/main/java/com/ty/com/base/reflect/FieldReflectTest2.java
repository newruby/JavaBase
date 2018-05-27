package com.ty.com.base.reflect;

/**
 * created by TY on 2018/5/27.
 */

import java.lang.reflect.Field;
import java.util.Set;

/**
 * 获取特定属性
 * @param
 * @return
 */
public class FieldReflectTest2 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.ty.com.base.reflect.User");

        Field idF = c.getDeclaredField("id");

        Object o = c.newInstance();
        idF.setAccessible(true);
        idF.set(o, "100");
        System.out.println(idF.get(o));
    }
}
/*100*/