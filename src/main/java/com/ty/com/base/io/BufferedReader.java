package com.ty.com.base.io;

/**
 * created by TY on 2018/5/26.
 */

import java.io.FileReader;

/**
 *使用BufferedReader  对FileReader中的close方法进行扩展
 * 1.装饰者模式中要求：装饰者中含有被装饰者的引用
 * 2.装饰者和被装饰者应该实现同一个类型
 * Reader
 * FileReader
 * Test
 * @param
 * @return
 */

//装饰者
public class BufferedReader extends Reader {
    //关联关系
    //FileReader就是装饰者
//    FileReader reader;
    Reader reader;

    //Constructor
//    BufferedReader(FileReader reader) {
    BufferedReader(Reader reader) {
        this.reader = reader;
    }

    //对FileReader中的close方法进行扩展
    @Override
    public void close() {
        System.out.println("extend code1!");
        reader.close();
        System.out.println("extend code2!");
    }
}
