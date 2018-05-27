package com.ty.com.base.multithread;

/**
 * created by TY on 2018/5/27.
 */
/**
 * 启动线程五秒之后打断线程的休眠
 * @param
 * @return
 */
public class ThreadTest5 {
    public static void main(String[] args) throws InterruptedException{
        Thread t = new Thread(new Processor5());

        t.setName("t");

        t.start();

        Thread.sleep(5000);
        //依靠异常处理
        t.interrupt();
    }
}

class Processor5 implements Runnable {
    //依靠异常处理
    @Override
    public void run() {
        try {
            Thread.sleep(100000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+ "---->" + i);
        }
    }
}