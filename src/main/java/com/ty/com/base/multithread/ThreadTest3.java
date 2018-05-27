package com.ty.com.base.multithread;

/**
 * created by TY on 2018/5/27.
 */
public class ThreadTest3 {
    public static void main(String[] args) {
        //获取当前线程对象
        Thread t = Thread.currentThread();

        //获取名字
        System.out.println(t.getName());

        Thread t1 = new Thread(new Processor3());

        //给线程起名
        t1.setName("t1");
        t1.start();

        Thread t2 = new Thread(new Processor3());
        t2.setName("t2");
        t2.start();
    }
}

class Processor3 implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
    }
}

    /*
    main
    t1
    t2*/
