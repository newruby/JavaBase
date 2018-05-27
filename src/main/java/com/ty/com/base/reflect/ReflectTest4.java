package com.ty.com.base.reflect;

/**
 * created by TY on 2018/5/27.
 */

import java.io.FileInputStream;
import java.util.Properties;

/**
 * IO + Properties
 * @param
 * @return
 */
public class ReflectTest4 {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("dbinfo.txt");

        p.load(fis);
        fis.close();
        String v = p.getProperty("username");

        System.out.println(v);
    }

}
