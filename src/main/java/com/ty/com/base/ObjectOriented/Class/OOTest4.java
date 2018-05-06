package com.ty.com.base.ObjectOriented.Class;

/**
 * created by TY on 2018/5/6.
 */

/*程序在执行过程中，参数的传递问题
* 1.传递的数据是基本数据类型
* 2.传递的数据是引用数据类型
*/

//传递基本数据类型程序
public class OOTest4 {
    public static void m1(int i) {
        i++;
        System.out.println("m1------->" + i);
    }

    //入口
    public static void main(String[] args) {
        //局部变量
        int i = 10;

        m1(i);

        System.out.println("main------->" + i);//10!!!

    }
}
