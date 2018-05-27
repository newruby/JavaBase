package com.ty.com.base.reflect;

/**
 * created by TY on 2018/5/27.
 */

import java.io.FileReader;

import java.util.Properties;

/**
 * 动态创建对象
 * @param
 * @return
 */
public class ReflectTest5 {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        FileReader fr = new FileReader("classinfo.properties");

        p.load(fr);
        fr.close();

        String className = p.getProperty("className");

        Class c = Class.forName(className);
        Object o = c.newInstance();
        System.out.println(o);
    }
}
