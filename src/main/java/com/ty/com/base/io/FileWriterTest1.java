package com.ty.com.base.io;

import java.io.FileWriter;

/**
 * created by TY on 2018/5/26.
 */
public class FileWriterTest1 {
    public static void main(String[] args) throws Exception{
        FileWriter fw = new FileWriter("E:/output.txt");//覆盖

//      FileWriter fw = new FileWriter("E:/output.txt", true);;//追加

        fw.write("leader from 127");

        //写入chars一部分
        char[] chars = {'Y', 'o', 'u', 'r'};
        fw.write(chars, 0, 3);

        fw.flush();

        fw.close();

    }
}
