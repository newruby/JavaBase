package com.ty.com.base.io;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * created by TY on 2018/5/26.
 */
public class BufferedReaderTest1 {
    public static void main(String[] args) throws Exception {
        //创建一个带有缓冲区的字符输入流
        BufferedReader br = new BufferedReader(new FileReader("E:/para.txt"));

        String temp = null;
        //readLine()读取一行但是行尾不带换行符
        while((temp = br.readLine()) != null) {
            System.out.println(temp);
        }

        //装饰者模式 关闭最外层的包装流不用管节点流
        br.close();
    }
}
