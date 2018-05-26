package com.ty.com.base.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * created by TY on 2018/5/26.
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bp.txt")) ;

        Object o = ois.readObject();

        System.out.println(o);

        ois.close();

    }
}
