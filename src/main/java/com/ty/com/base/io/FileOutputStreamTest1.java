package com.ty.com.base.io;

import java.io.FileOutputStream;

/**
 * created by TY on 2018/5/26.
 */
public class FileOutputStreamTest1 {
    public static void main(String[] args) {

        FileOutputStream fos  = null;
        try {
            //1.创建文件字节输出流
            //不存在自动创建
            fos = new FileOutputStream("E:/out.txt");
            //追加的方式写入
//          fos = new FileOutputStream("E:/out.txt",true);
            //2.开始写
            String msg = "HelloTY";
            //将String转换成byte数组
            byte[] bytes = msg.getBytes();
            fos.write(bytes);
            //写入一部分
            fos.write(bytes, 0 , 3);
            //3.最后为了保证数据完全写入强制写入
            fos.flush();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            //4.close
            if(fos != null) {
                try {

                    fos.close();
                }catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
