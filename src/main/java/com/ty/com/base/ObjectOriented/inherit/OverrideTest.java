package com.ty.com.base.ObjectOriented.inherit;

/**
 * created by TY on 2018/5/7.
 */
/**
 * 方法的覆盖 /重写 Override
 * 发生在具有继承关系的两个类中(区别方法的重载)
 * @param
 * @return
 */
public class OverrideTest {
    public static void main(String[] args) {
        //创建子类对象
        Cat c = new Cat();
        //调用方法
        c.move();
    }
}

//父类
class Animal {
    public void move() {
        System.out.println("动物在移动");
    }
}
//子类
class Cat extends Animal {
    @Override
    public void move() {
        System.out.println("猫在走猫步");
    }
}
