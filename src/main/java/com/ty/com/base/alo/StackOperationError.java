package com.ty.com.base.alo;

/**
 * created by TY on 2018/5/14.
 */

/**
 * 自定义异常
 */
public class StackOperationError extends Exception{
    StackOperationError() {};
    StackOperationError(String msg) {
        super(msg);
    };
}
