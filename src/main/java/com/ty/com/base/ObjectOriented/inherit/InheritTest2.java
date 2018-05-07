package com.ty.com.base.ObjectOriented.inherit;

/**
 * created by TY on 2018/5/7.
 */

/**
 * Account.java
 * DebitAccount.java
 * @param \
 * @return
 */
public class InheritTest2 {
    public static void main(String[] args) {
        //创建信用卡对象
        DebitAccount da = new DebitAccount();

        da.setActno("001");
        //可以间接访问
        System.out.println(da.getActno());
        //不能直接访问
        //System.out.println(da.actno);
    }
}
