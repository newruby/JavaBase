package com.ty.com.base.io;

import java.io.FileInputStream;

/**
 * created by TY on 2018/5/26.
 */
public class FileInputStreamTest3  {
    public static void main(String[] args) throws Exception {
        //创建输入流
        //E:/para.txt abcdefg
        FileInputStream fis = new FileInputStream("E:/para.txt");

        System.out.println(fis.available());
        System.out.println(fis.read());

        //int available返回流中剩余的估计字节数

        System.out.println(fis.available());
        //跳过两个字节
        fis.skip(2);

        System.out.println(fis.read());
        System.out.println(fis.available());

        fis.close();

    }
}

       /*
        7
        97
        6
        100
        3*/
