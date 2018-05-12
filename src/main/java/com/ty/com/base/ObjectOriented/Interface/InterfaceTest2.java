package com.ty.com.base.ObjectOriented.Interface;

/**
 * created by TY on 2018/5/12.
 */
/**
 * Engine
 * Car
 * YAMAHA
 * HONDA
 * @param
 * @return
 */
public class InterfaceTest2 {
    public static void main(String[] args) {
        //生产引擎
        Engine engine = new YAMAHA();
        //生产汽车
        Car car = new Car(engine);
        //测试引擎
        car.testEngine(engine);
        //换引擎
        car.testEngine(new HONDA());
    }
}
