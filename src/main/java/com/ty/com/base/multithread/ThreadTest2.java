package com.ty.com.base.multithread;

/**
 * created by TY on 2018/5/27.
 */

/**
 * 第二种方式
 * 写一个类实现java.lang.Runnable
 * 实现run方法
 * @param
 * @return
 */
public class ThreadTest2 {
    public static void main(String[] args) {


        Thread t = new Thread(new Processor2());
        t.start();

    }
}


//推荐
class Processor2 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("run---->" + i);
        }
    }
}