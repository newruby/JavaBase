package com.ty.com.base.collection;

import java.util.Properties;

/**
 * created by TY on 2018/5/26.
 */

/**
 * java.util.Properties    key 和value都是String
 * @param
 * @return
 */
public class MapTest2 {
    public static void main(String[] args) {
        //创建属性类对象
        Properties p = new Properties();

        p.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
        p.setProperty("username", "Scott");
        p.setProperty("password", "ducun");
        //如果key重复Value采用的是覆盖
        p.setProperty("username", "Peter");


        String v1 = p.getProperty("driver");
        String v2 = p.getProperty("username");
        String v3 = p.getProperty("password");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

    }
}

/*
    oracle.jdbc.driver.OracleDriver
    Peter
    ducun*/
