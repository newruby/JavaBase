package com.ty.com.base.ObjectOriented.polymorphism;

/**
 * created by TY on 2018/5/8.
 */

/**
 * Animal.java
 * Dog.java
 * Cat.java
 * Person.java
 * 多态的好处
 * 模拟主人喂宠物
 * @param \
 * @return
 */
public class Test2 {

    public static void main(String[] args) {
        //创建主人
        Person ty = new Person();

        //创建动物
        Cat cat = new Cat();
        Dog dog = new Dog();

        //多态 父类型引用对象指向子类型引用对象
        ty.feed(cat);
        ty.feed(dog);
    }


}
