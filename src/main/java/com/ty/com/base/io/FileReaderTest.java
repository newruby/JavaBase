package com.ty.com.base.io;

import java.io.FileReader;

/**
 * created by TY on 2018/5/26.
 */
public class FileReaderTest {
    public static void main(String[] args) {
        FileReader fr = null;
        //创建文件字符输入流
        try {
            fr = new FileReader("E:/阅读说明.txt");

            char[] chars = new char[512];// 1kb
            int temp = 0;
            while((temp = fr.read(chars)) != -1) {
                System.out.println(new String(chars, 0, temp));
            }

        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            if(fr != null) {
                try {
                    fr.close();
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
