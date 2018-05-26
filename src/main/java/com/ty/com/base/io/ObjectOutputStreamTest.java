package com.ty.com.base.io;

/**
 * created by TY on 2018/5/26.
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *  java.io.ObjectOutputStream;序列化JAVA对象到硬盘(Serial)
 *  java.io.ObjectInputStream;硬盘中的数据反序列化到JVM内存(DeSerial)
 *
 *  ObjectInputStreamTest
 *  User
 * @param
 * @return   
 */  
public class ObjectOutputStreamTest {
    public static void main(String[] args) throws Exception{
        User u = new User("TY");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bp.txt"));

        oos.writeObject(u);

        oos.flush();

        oos.close();

    }
}
