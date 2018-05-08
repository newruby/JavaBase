package com.ty.com.base.ObjectOriented.polymorphism;

/**
 * created by TY on 2018/5/8.
 */
//主人
public class Person {
    /*
    public void feed(Cat cat) {
        cat.eat();
    }
    public void feed(Dog dog) {
        dog.eat();
    }
    */
    //上述代码一旦有业务改变 扩展能力太差

    public void feed(Animal animal) {
        animal.eat();
    }

}
