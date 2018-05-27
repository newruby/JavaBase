package com.ty.com.base.multithread;

/**
 * created by TY on 2018/5/27.
 */
/**
 * 线程的合并
 * @param
 * @return
 */

public class ThreadTest8 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Processor8());

        //给线程起名
        t.setName("t");
        t.start();

        //主线程合并
        t.join();
        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);
        }
    }

}

class Processor8 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {

            }
            System.out.println(Thread.currentThread().getName() + "---->" + i);
        }
    }
}


/*      t---->0
        t---->1
        t---->2
        t---->3
        t---->4
        main---->0
        main---->1
        main---->2
        main---->3
        main---->4
        main---->5
        main---->6
        main---->7
        main---->8
        main---->9

去掉t.join();
        main---->0
        main---->1
        main---->2
        main---->3
        main---->4
        main---->5
        main---->6
        main---->7
        main---->8
        main---->9
        t---->0
        t---->1
        t---->2
        t---->3
        t---->4*/
