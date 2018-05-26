package com.ty.com.base.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * created by TY on 2018/5/26.
 */
public class DataOutputStreamTest {
    public static void main(String[] args) throws Exception {
        //创建数据字节输出流
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("E:/tmp.txt"));

        byte b = 10;
        short s = 11;
        int i = 12;
        long l = 10000L;
        float f =3.2f;
        double d =2.3;
        boolean flag = false;
        char c ='a';

        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(flag);
        dos.writeChar(c);

        dos.flush();
        dos.close();

    }
}
