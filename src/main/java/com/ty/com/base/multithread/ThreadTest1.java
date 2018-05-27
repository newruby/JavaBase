package com.ty.com.base.multithread;

/**
 * created by TY on 2018/5/27.
 */

/**
 * 创建和启动线程
 * 第一种
 * @param
 * @return
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        //2.创建线程
        Thread t = new Processor();

        //3.启动线程 自动调用run
        t.start();
        //t.run();调用run普通方法调用 run方法结束下面的代码才运行

        //这段代码在主线程中运行
        for(int i = 0; i < 10; i++) {
            System.out.println("main---->" + i);
        }

    }
}

//1.定义一个线程
class Processor extends Thread {

    //重写run方法
    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("run---->" + i);
        }
    }
}