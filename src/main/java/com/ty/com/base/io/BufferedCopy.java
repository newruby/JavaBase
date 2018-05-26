package com.ty.com.base.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * created by TY on 2018/5/26.
 */
public class BufferedCopy {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("E:/op.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:/o.txt"));

        String temp = null;
        while((temp = br.readLine()) != null) {
            bw.write(temp);
            bw.newLine();
        }

        bw.flush();

        br.close();
        bw.close();

    }
}
