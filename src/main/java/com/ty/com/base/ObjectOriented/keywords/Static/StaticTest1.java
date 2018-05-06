package com.ty.com.base.ObjectOriented.keywords.Static;

/**
 * created by TY on 2018/5/6.
 */

/**
  static定义静态语句块
*/
public class StaticTest1 {
//    静态语句块
    static {
        System.out.println("1");
    }
    static {
        System.out.println("2");
    }
    static {
        System.out.println("3");
    }
    static {
        System.out.println("4");
    }

    public static void main(String[] args) {
        System.out.println("excute1");
        System.out.println("excute2");
    }
}

/*
程序结果
1
2
3
4
excute1
excute2
*/
