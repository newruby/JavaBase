package com.ty.com.base.ObjectOriented.Interface;

/**
 * created by TY on 2018/5/12.
 */
/**
 * 接口的实现类面向接口去实现
 * CustomerService
 * CustomerServiceImpl
 * @param
 * @return
 */
public class InterfaceTest1 {
    public static void main(String[] args) {
        //面向接口去调用
        CustomerService cs = new CustomerServiceImpl();
        cs.logout();
    }
}
