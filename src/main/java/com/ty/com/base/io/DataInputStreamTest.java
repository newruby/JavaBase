package com.ty.com.base.io;

import java.io.DataInputStream;
import java.io.FileInputStream;


/**
 * created by TY on 2018/5/26.
 */
public class DataInputStreamTest {
    public static void main(String[] args) throws Exception{



        //创建输入流
        DataInputStream dis =new DataInputStream(new FileInputStream("E:/tmp.txt"));

        //要使用该流读取数据，必须提前知道该文件中数据的存储格式
        byte b = dis.readByte();
        short s = dis.readShort();
        int i = dis.readInt();
        long l = dis.readLong();
        float f = dis.readFloat();
        double d = dis.readDouble();
        boolean bl = dis.readBoolean();
        char c = dis.readChar();

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bl);
        System.out.println(c);

        dis.close();



    }
}
