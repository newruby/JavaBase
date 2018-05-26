package com.ty.com.base.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * created by TY on 2018/5/26.
 */
public class BufferedWriterTest {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:/op.txt"));

        bw.write("neo got my back");
        bw.newLine();
        bw.write("neo got my back");

        bw.flush();
        bw.close();
    }

}
