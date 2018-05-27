package com.ty.com.base.multithread;

/**
 * created by TY on 2018/5/27.
 */

/**
 *如何正确终止一个正在执行的线程
 * @param
 * @return
 */
public class ThreadTest6 {
    public static void main(String[] args) throws InterruptedException {
        Processor6 p = new Processor6();
        Thread t = new Thread(p);
        t.setName("t");
        t.start();

        Thread.sleep(5000);
        //终止
        p.run = false;
    }
}

class Processor6 implements Runnable {
    boolean run = true;
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            if(run) {
                try{Thread.sleep(1000);}catch (InterruptedException e){}
            }else {
                return;
            }
        }
    }
}