package com.ty.com.base.multithread;

/**
 * created by TY on 2018/5/20.
 */
public class ThreadTest {
    public static void main(String[] args) throws Exception {


        Thread t1 = new Thread(new Processor1());
        Thread t2 = new Thread(new Processor1());

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        //延迟保证t1先执行
        Thread.sleep(1000);

        t2.start();
    }
}

class Processor1 implements Runnable{
    @Override
    public void run() {
        if("t1".equals(Thread.currentThread().getName())) {
            MyClass.m1();
        }
        if("t2".equals(Thread.currentThread().getName())) {
            MyClass.m2();
        }
    }


}
class MyClass {
    //类锁只有一个
    public synchronized static void m1() {
        try {
            Thread.sleep(10000);
        }catch(Exception e) {}

        System.out.println("m1------");
    }

//    public static void m2() {
//        System.out.println("m2------");
//    }

    public synchronized static void m2() {
        System.out.println("m2------");
    }

}