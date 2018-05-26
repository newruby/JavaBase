package com.ty.com.base.io;

/**
 * created by TY on 2018/5/26.
 */

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.io.PrintStream;标准的输出流，默认打印到控制台，以字节的方式
 * java.io.PrintWriter;以字符的方式
 * @param   
 * @return   
 */  
public class PrintStreamTest {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello");
        PrintStream ps = System.out;
        ps.println("NEO");

        //可以改变输出方向
        //通常使用这种方式记录日志
        System.setOut(new PrintStream(new FileOutputStream("log.txt")));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-MM-ss SSS");
        //记录M1方法开始执行的时间和结束的时间
        System.out.println("m1 method start excute" + sdf.format(new Date()));
        m1();
        System.out.println("m1 method excute" + sdf.format(new Date()));

    }

    public static void m1() {
        System.out.println("m1 method excute");
    }
}
