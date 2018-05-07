package com.ty.com.base.ObjectOriented.inherit;

/**
 * created by TY on 2018/5/7.
 */

/**
 * 信用账户 子类
 * 构造方法不能被继承
 * 可将父类中包括私有数据继承过来
 * 不能直接访问可间接
 * @param
 * @return
 */
public class DebitAccount extends Account {
    //信誉度
    double debit;
}
