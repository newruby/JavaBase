package com.ty.com.base.ObjectOriented.keywords.Static;

/**
 * created by TY on 2018/5/6.
 */

/*
  实例语句块
*/
public class StaticTest2 {

    //    实例语句块
    {
        System.out.println("1");
    }
    {
        System.out.println("2");
    }
    {
        System.out.println("3");
    }
     {
        System.out.println("4");
    }

    //构造方法
    StaticTest2() {
        System.out.println("无参数构造方法和执行");
    }
    public static void main(String[] args) {

        //调用构造方法
        new StaticTest2();
        new StaticTest2();
        new StaticTest2();
    }
}

/*程序结果
        1
        2
        3
        4
        无参数构造方法和执行
        1
        2
        3
        4
        无参数构造方法和执行
        1
        2
        3
        4
        无参数构造方法和执行
*/
