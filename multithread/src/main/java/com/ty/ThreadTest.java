package com.ty;

/**
 * created by TY on 2018/5/29.
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread t = new MyThread("T");

        t.start();

    }
}

class MyThread extends Thread {

    public MyThread(String name) {
        super();
        this.setName(name);
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + "------" + i);
        }

    }
}