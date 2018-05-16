package com.ty.com.base.alo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * created by TY on 2018/5/15.
 */
public class StringMethod {
    public static void main(String[] args) {
        //
        String s1 = "neo got my back";
        System.out.println(s1.charAt(2));

        //
        System.out.println("HelloWorld, java".endsWith("java "));

        //
        System.out.println("ABC".equalsIgnoreCase("abc"));

        //
        byte[] bytes = "abc".getBytes();
        for(byte b:bytes) {
            System.out.println(b);
        }

        //
        System.out.println("neo got my back".indexOf("back"));

        //
        System.out.println("tech tech on my mind".indexOf("tech", 1));

        //
        System.out.println("tech tech on my mind".lastIndexOf("tech"));

        //
        System.out.println("tech tech on my mind".lastIndexOf("tech", 1));
        System.out.println("tech tech on my mind".lastIndexOf("tech", 6));//5  反向搜索

        //
        System.out.println("tech tech on my mind".replaceAll("tech", "nct"));

        //
        String time = "2000,08,30";
        String[] sp = time.split( ",");
        for(String s:sp) {
            System.out.println(s);
        }

        //
        System.out.println("neo got my back".startsWith("neo"));

        //
        System.out.println("neo got my back".substring(4));

        //
        System.out.println("neo got my back".substring(4,7));

        //
        char[] c2 = "black on black".toCharArray();
        for(char c:c2) {
            System.out.println(c);
        }

        //
        System.out.println("abc".toUpperCase());

        //
        System.out.println("abc".toLowerCase());

        //
        Object o = new Object();
        System.out.println(o);
        System.out.println(String.valueOf(o));
        o = null;
        System.out.println(o);
        System.out.println(String.valueOf(o));

        //true aaaa
        System.out.println("aa".matches("^a{2}$"));
        System.out.println("2aa2".replaceAll("\\d","a"));

        //字符串频繁拼接推荐使用StringBuffer
        StringBuffer sb = new StringBuffer();
        sb.append(1);
        sb.append(1);
        sb.append(1);
        System.out.println(sb);



    }
}

        /*o
        false
        true
        97
        98
        99
        11
        5
        5
        0
        5
        nct nct on my mind
        2000
        08
        30
        true
        got my back
        got
        b
        l
        a
        c
        k

        o
        n

        b
        l
        a
        c
        k
        ABC
        abc
        java.lang.Object@1540e19d
        java.lang.Object@1540e19d
        null
        null*/