package com.ty.com.base.io;

/**
 * created by TY on 2018/5/26.
 */

import java.io.FileReader;
import java.io.FileWriter;

/**
 *  文件复制只能复制纯文本文件
 * @param
 * @return
 */
public class FileWriterTest2 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("E:/para.txt");
        FileWriter fw = new FileWriter("E:/paraout.txt");

        char[] chars = new char[512];
        int temp = 0;
        while((temp = fr.read(chars)) != -1) {
            fw.write(chars, 0 , temp);
        }

        fw.flush();

        //两个都要关
        fr.close();
        fw.close();
    }
}
