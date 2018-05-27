package com.ty.com.base.multithread;

/**
 * created by TY on 2018/5/27.
 */
/**
 *Thread.yeid  让同优先级的线程有执行的机会
 * @param
 * @return
 */
public class ThreadTest7 {
    public static void main(String[] args) throws InterruptedException {
       /*Thread t = new Thread(new Processor7());*/
        Thread t = new Processor7();
        t.setName("t");
        t.start();



        for(int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);
        }

    }
}

class Processor7 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);
            if(i % 20 == 0) {
                Thread.yield();
            }
        }
    }
}