package com.ty.com.base.ObjectOriented.interfaces;

/**
 * created by TY on 2018/5/10.
 */

public interface A {
    //常量
    public static final String SUCCESS = "success";
    public static final double PI = 3.14;

    //public static final可以省略但还是常量
    byte MAX_VALUE = 127;
    //抽象方法
    //接口中所有的抽象方法都是public abstract
    public abstract void m1();
    //public abstract可以省略
    void m2();
}

interface B {
    void m1();
}
interface C {
    void m2();
}
interface D {
    void m3();
}
//接口和接口之间可以实现多继承
interface E extends B,C,D {
    void m4();
}
//一个类可以实现多个接口

class MycClass implements B,C {
    @Override
    public void m1() {}

    @Override
    public void m2() {}
}
//需要将接口中所有的方法重写
class F implements E {
    @Override
    public void m1() {

    }
    @Override
    public void m2() {

    }
    @Override
    public void m3() {

    }
    @Override
    public void m4() {

    }
}