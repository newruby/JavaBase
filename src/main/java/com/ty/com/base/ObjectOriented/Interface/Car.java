package com.ty.com.base.ObjectOriented.Interface;

/**
 * created by TY on 2018/5/12.
 */
public class Car {
    //生产汽车 面向接口
    Engine engine;
    Car(Engine engine) {
        this.engine = engine;
    }
    //测试引擎
    public void testEngine(Engine engine) {
        engine.start();
    }
}
