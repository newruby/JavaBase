package com.ty.com.base.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * created by TY on 2018/5/13.
 */
/**
 *深入throws
 * 使用throws并不是真正处理异常向上抛推卸
 * 谁调用就抛给谁
 * @param
 * @return
 */
public class ExceptionTest2 {
    public static void main(String[] args) throws FileNotFoundException {

       //m1()方法出现异常采用上抛给JVM  JVM遇到这个异常就会退出
       m1();

//        //真正会处理
//        try {
//            m1();
//        }catch(FileNotFoundException e){}
//        //下面代码可以运行
//        System.out.println("Hello");
    }
    public static void m1() throws FileNotFoundException {
        m2();
    }
    public static void m2() throws FileNotFoundException{
        m3();
    }
    public static void m3() throws FileNotFoundException{
        //FileInputStream构造方法在声明的位置上使用使用throws
        new FileInputStream("C:/a.txt");

    }

}
