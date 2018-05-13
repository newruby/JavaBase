package com.ty.com.base.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


/**
 * created by TY on 2018/5/13.
 */
/**
 * 处理编译时异常
 * 方法一声明抛出
 * @param
 * @return
 */
public class ExceptionTest1 {
    public static void main(String[] args) throws FileNotFoundException{
//  public static void main(String[] args) throws IOException{
//  public static void main(String[] args) throws Exception{
        //方法一声明抛出
        /*
         *  FileInputStream构造方法在声明的位置上使用使用throws FileNotFoundException
         *  java编译器检测FileNotFoundException父类型Exception 发现是编译时异常
         *  so知道这个FileInputStream异常发生几率比较高 需要进行处理
         * @param [args]
         * @return void
         */
        FileInputStream files = new FileInputStream("C:/a.txt");

    }
}
