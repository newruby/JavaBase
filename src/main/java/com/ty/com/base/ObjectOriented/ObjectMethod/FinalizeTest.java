package com.ty.com.base.ObjectOriented.ObjectMethod;

/**
 * created by TY on 2018/5/12.
 */
/**
 *  finalize方法每个对象都有
 *  当引用不再指向该对象
 *  该对象变成垃圾等待垃圾回收器回收
 *  回收之前自动调用finalize
 * @param
 * @return
 */
public class FinalizeTest {
    public static void main(String[] args) {
        Person p = new Person();
        //没有引用再指向 等待垃圾回收器回收
        p = null;
        //程序员只能 建议 垃圾回收器回收
        System.gc();//马上就要被回收
    }
}

class Person {
    @Override
    public void finalize() throws Throwable{
        System.out.println("马上就要被回收");
        //让引用重新指向该对象不是垃圾数据不会被回收
//      Person p = this;
    }
}
