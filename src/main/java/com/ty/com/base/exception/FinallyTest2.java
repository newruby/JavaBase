package com.ty.com.base.exception;

/**
 * created by TY on 2018/5/13.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 为保证资源一定会释放
 * 放到finally语句块
 * @param
 * @return
 */
public class FinallyTest2 {
    public static void main(String[] args) {
        FileInputStream files = null;
        try{
            files = new FileInputStream("C:/abc.txt");

        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(files != null) {
                try{
                    files.close();
                }catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
