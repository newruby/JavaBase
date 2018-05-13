package com.ty.com.base.exception;

/**
 * created by TY on 2018/5/13.
 */

/**
 *深入finally
 */
public class FinallyTest1 {
    public static void main(String[] args) {
        int i = m1();
        System.out.println(i);//10！！！
    }
    public static int  m1() {
        int i = 10;
        try{
            return i;
        }finally{
            i++;
            System.out.println("m1的i = " + i);//11
        }
    }
//    代码执行原理
//   public static int  m1() {
//       int i = 10;
//        try{
//            int tmp = i;
//            return tmp;
//        }finally{
//            i++;
//            System.out.println("m1的i = " + i);//11
//        }
//    }
}

/*  注意输出结果
m1的i = 11
10
*/