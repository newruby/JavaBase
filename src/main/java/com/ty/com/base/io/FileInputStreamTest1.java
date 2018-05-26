package com.ty.com.base.io;

import java.io.FileInputStream;

/**
 * created by TY on 2018/5/26.
 */
public class FileInputStreamTest1 {
    public static void main(String[] args) throws Exception {
        //创建流
        //E:/para.txt  abcdef
        FileInputStream fis = new FileInputStream("E:/para.txt");

        //开始读
        int temp = 0;
        while((temp = fis.read()) != -1) {
            System.out.println(temp);
        }

        //close
        fis.close();
    }
}

        /*97
        98
        99
        100
        101
        102 */