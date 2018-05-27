package com.ty.com.base.multithread;

/**
 * created by TY on 2018/5/20.
 */
public class WithDraw {
    public static void main(String[] args) {
        //创建一个共享的账户
        Account act = new Account("act---001", 5000.0);
        //创建线程对同一个账户取款
        Processor p = new Processor(act);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
//      Thread t1 = new Thread(new Processor(act));
//      Thread t1 = new Thread(new Processor(act));

        t1.start();
        t2.start();
    }

}


//取款processor
class Processor implements Runnable {
    Account act;

    //!!!
    Processor(Account act) {
        this.act = act;
    }
    @Override
    public void run() {
        act.withdraw(1000.0);
        System.out.println("取款1000，balance：" + act.getBanlance());
    }

}


//账户

class Account {
    String actno;
    double banlance;

    Account() {}
    Account(String actno, double banlance) {
        this.actno = actno;
        this.banlance = banlance;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public void setBanlance(double banlance) {
        this.banlance = banlance;
    }

    public String getActno() {
        return actno;
    }

    public double getBanlance() {
        return banlance;
    }

    public void withdraw(double money) {
        //该方法要求只能有一个线程执行 把需要同步的代码放在同步语句块
       synchronized (this) {
           double after = this.banlance - money;

           //update
           this.setBanlance(after);
       }
    }
}
