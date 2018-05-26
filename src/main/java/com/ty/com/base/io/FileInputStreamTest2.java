package com.ty.com.base.io;

import java.io.FileInputStream;

/**
 * created by TY on 2018/5/26.
 */
public class FileInputStreamTest2 {
    public static void main(String[] args) throws Exception{
        //创建输入流
        //E:/para.txt abcdefg
        FileInputStream fis = new FileInputStream("E:/para.txt");

        //开始读
        //准备一个byte数组  每次最多读三个字节
        byte[] bytes = new byte[3];
        //返回int代表读取字节个数
        int i1 = fis.read(bytes);

        //将byte数组转换成字符串
        System.out.println(new String(bytes));

        int i2 = fis.read(bytes);

        System.out.println(new String(bytes));

        int i3 = fis.read(bytes);
        System.out.println(new String(bytes, 0, i3));

        int i4 = fis.read(bytes);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

//        //用循环表示
//        //abc def  g
//        int temp = 0;
//        while((temp = fis.read(bytes)) != -1) {
//            System.out.println(new String(bytes, 0, temp));
//        }


        fis.close();

    }
}

/*
    abc
    def
    g
        3
        3
        1
        -1*/
