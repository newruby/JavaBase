package com.ty.com.base.multithread;

/**
 * created by TY on 2018/5/27.
 */
public class ThreadTest4 {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Processor4();
        t1.setName("t1");
        t1.start();

        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+ "---->" + i);

            //让主线程阻塞500ms
            Thread.sleep(500);
        }
    }
}

//run方法中的异常只能try catch
class Processor4 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+ "---->" + i);
            try {
                //让当前线程阻塞1000ms
                Thread.sleep(1000);
            }catch(InterruptedException e ) {
                e.printStackTrace();
            }

        }
    }
}