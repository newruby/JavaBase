package com.ty.com.base.multithread;

/**
 * created by TY on 2018/5/20.
 */
/**
 * 死锁
 * @param
 * @return
 */

public class DeadLock {
    public static void main(String[] args) throws Exception {
        Object o1 = new Object();
        Object o2 = new Object();

        Thread t1 = new Thread(new Thread1(o1, o2));
        Thread t2 = new Thread(new Thread2(o1, o2));

        t1.start();

        t2.start();
    }
}

class Thread1 implements Runnable {
    Object o1 = new Object();
    Object o2 = new Object();

    Thread1(Object o1, Object o2){
        this.o1 = o1;
        this.o2 = o2;
    }
    @Override
    public void run() {
        synchronized (o1)  {
            //延迟
            try{ Thread.sleep(1000);}catch(Exception e) {}
            synchronized (o2) {
            }
        }
    }
}
class Thread2 implements Runnable {
    Object o1 = new Object();
    Object o2 = new Object();

    Thread2(Object o1, Object o2){
        this.o1 = o1;
        this.o2 = o2;
    }
    @Override
    public void run() {
        synchronized (o2) {
            //延迟
            try{ Thread.sleep(1000);}catch(Exception e) {}
            synchronized (o1) {
            }
        }
    }
}