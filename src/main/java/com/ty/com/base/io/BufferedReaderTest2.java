package com.ty.com.base.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * created by TY on 2018/5/26.
 */
public class BufferedReaderTest2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("E:/para.txt");
        //转换流
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        //合并
//      BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("")));

    }

}
