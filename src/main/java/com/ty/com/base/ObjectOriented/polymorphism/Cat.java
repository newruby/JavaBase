package com.ty.com.base.ObjectOriented.polymorphism;

/**
 * created by TY on 2018/5/8.
 */
public class Cat extends Animal{
    //override
    @Override
    public void  eat() {
        System.out.println("猫在吃鱼");
    }

    //特有的方法
    public void move() {
        System.out.println("猫在走猫步");
    }
}
