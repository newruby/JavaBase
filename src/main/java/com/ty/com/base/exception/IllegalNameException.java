package com.ty.com.base.exception;

/**
 * created by TY on 2018/5/13.
 */
/**
 * 自定义无效名字异常
 * 1.编译时异常直接继承Exception
 * 2.运行时异常直接继承RuntimeException
 * @param
 * @return
 */
public class IllegalNameException extends Exception {
    //定义异常一般提供两个构造方法
    public IllegalNameException() {}
    public IllegalNameException(String msg) {
        super(msg);
    }
}
