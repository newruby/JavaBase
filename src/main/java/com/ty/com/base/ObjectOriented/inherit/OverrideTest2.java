package com.ty.com.base.ObjectOriented.inherit;

/**
 * created by TY on 2018/5/8.
 */

/**
 * 私有的方法无法被覆盖
 * @param
 * @return
 */
public class OverrideTest2 {
    //私有方法
    private void m1() {
        System.out.println("A'm1 method invoke!");
    }
    public static void main(String[] args) {
        //多态
        OverrideTest2 a = new Bclass();
        a.m1();//A'm1 method invoke!
    }
}


class Bclass extends OverrideTest2 {
    //尝试重写父类的私有方法

    public void m1() {
        System.out.println("B'm1 method invoke!");
    }

}

