package com.ty.com.base.alo;

import javax.lang.model.element.NestingKind;

/**
 * created by TY on 2018/5/16.
 */
public class PackedClass {
    public static void main(String[] args) {
        //int String Integer  transform
        //int->String  int+""
        String s1 = 10 + "";

        //String->int
        int i1 = Integer.parseInt("123");

        //int->Integer
        Integer i2 = Integer.valueOf(10);

        //Integer->int
        int i3 = i2.intValue();

        //Integer->String
        String s2 = i2.toString();

        //String->Integer
        Integer i4 = Integer.valueOf("123");

        //整形常量池范围[-128-127]
        Integer integer1= 127;
        Integer integer2= 127;
        System.out.println(integer1 == integer2);

        Integer integer3= -129;
        Integer integer4= -129;
        System.out.println(integer3 == integer4);





    }
}
