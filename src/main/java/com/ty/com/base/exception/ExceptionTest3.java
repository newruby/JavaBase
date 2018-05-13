package com.ty.com.base.exception;

/**
 * created by TY on 2018/5/13.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 处理编译时异常
 * 方法二捕捉 try catch
 * @param
 * @return
 */
public class ExceptionTest3 {
    public static void main(String[] args) {
        try{
            FileInputStream files = new FileInputStream("C:/a.txt");
            //上面出现异常 try中代码不再执行 直接进入catch中执行
            files.read();
        }catch(FileNotFoundException e) {
            System.out.println("读取的文件不存在");

            //consolo:java.io.FileNotFoundException: C:\a.txt (系统找不到指定的文件。)
            //FileNotFoundException将toString方法重写
            System.out.println(e);

            //printStackTrace()方法打印异常堆栈信息
            // 一般用该方式调试程序
            /*java.io.FileNotFoundException: C:\a.txt (系统找不到指定的文件。)
            at java.io.FileInputStream.open0(Native Method)
            at java.io.FileInputStream.open(FileInputStream.java:195)
            at java.io.FileInputStream.<init>(FileInputStream.java:138)
            at java.io.FileInputStream.<init>(FileInputStream.java:93)
            at com.ty.com.base.exception.ExceptionTest3.main(ExceptionTest3.java:20)*/
            e.printStackTrace();

            //getMessage()取得异常描述信息
            //consolo:C:\a.txt (系统找不到指定的文件。)
//            JVM执行了下面这行代码
//            FileInputStream files = new FileInputStream("C:\a.txt (系统找不到指定的文件。)");
            System.out.println(e.getMessage());

        }catch(IOException e) {
        System.out.println("其他IO异常");
        }

 /*     catch可以写多个但必须从上到下 从小类型异常到大类型异常捕捉
        try{
            FileInputStream files = new FileInputStream("C:/a.txt");
            files.read();
        }catch(IOException e) {

        }catch(FileNotFoundException e) {

        }*/
    }
}
