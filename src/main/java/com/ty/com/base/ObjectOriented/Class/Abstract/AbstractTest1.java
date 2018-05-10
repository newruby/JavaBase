package com.ty.com.base.ObjectOriented.Class.Abstract;

/**
 * created by TY on 2018/5/10.
 */

/**
 *   抽象类 为了继承
 *   抽象方法为了重写
 *   ？？？
 * @param
 * @return
 */
public abstract class AbstractTest1 {
    AbstractTest1() {
        System.out.println("父类构造方法");
    }
    //抽象方法以;结束
    public abstract void m1();
    public static void main(String[] args) {
/*       //抽象类无法被实例化创建对象
        AbstractTest1 a = new AbstractTest1();*/
        //多态
        AbstractTest1 a = new BClass();
    }

}

class BClass extends AbstractTest1 {

    BClass() {
//    super();//父类的构造方法虽然被调用但没有创建对象
        System.out.println("子类构造方法");
    }
    //非抽象类继承抽象类
    // 必须重写抽象类中的抽象方法
    @Override
    public void m1() {

    }
}
/*
 父类构造方法
 子类构造方法
*/