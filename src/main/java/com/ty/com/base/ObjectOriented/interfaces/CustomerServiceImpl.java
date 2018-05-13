package com.ty.com.base.ObjectOriented.interfaces;

/**
 * created by TY on 2018/5/12.
 */
/**
 * 接口的实现类面向接口去实现
 *
 * @param
 * @return
 */
public class CustomerServiceImpl implements CustomerService {
    //实现接口的抽象方法

    @Override
    public void logout() {
        System.out.println("成功退出系统");
    }
}
