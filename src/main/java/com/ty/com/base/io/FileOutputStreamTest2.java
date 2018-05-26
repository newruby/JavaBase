package com.ty.com.base.io;

/**
 * created by TY on 2018/5/26.
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 文件的复制粘贴
 * @param
 * @return
 */
public class FileOutputStreamTest2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("E:/nct/record.docx");
        FileOutputStream fos = new FileOutputStream("E:/record.docx");

        //一边读一边写
        // 1kb
        byte[] bytes = new byte[1024];
        int temp = 0;
        while ((temp = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, temp);
        }
        fos.flush();

        fis.close();
        fos.close();
    }
}
