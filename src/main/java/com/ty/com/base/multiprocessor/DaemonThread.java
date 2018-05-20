package com.ty.com.base.multiprocessor;

/**
 * created by TY on 2018/5/20.
 */
public class DaemonThread {
    public static void main(String[] args) throws Exception{
        Thread t = new Daemon();
        t.setName("t");

        //将用户线程设置为守护线程
        t.setDaemon(true);

        t.start();
        for(int i = 0; i < 9; i++) {
            System.out.println(Thread.currentThread().getName() + "-----"+ i);
            Thread.sleep(1000);
        }
    }
}

class Daemon extends Thread {
    int i = 0;

    @Override
    public void run() {
        while(true) {
            i++;
            try{ Thread.sleep(500);}catch(Exception e) {}
            System.out.println(Thread.currentThread().getName() + "-----"+ i);
        }
    }
}