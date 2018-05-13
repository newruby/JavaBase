package com.ty.com.base.exception;

/**
 * created by TY on 2018/5/13.
 */
public class CustomerService {
    //对外提供一个注册的方法法
    public void register(String name) throws IllegalNameException{
        if(name.length() < 6) {
            //异常
//            //创建异常对象
//            IllegalNameException e = new IllegalNameException("用户名长度不能小于6");
//
//            //手动抛出异常
//            throw e;

            throw new IllegalNameException("用户名长度不能小于6");
        }
        System.out.println("register successfully");

    }
}
