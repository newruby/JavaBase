package com.ty.com.base.ObjectOriented.inherit;

/**
 * created by TY on 2018/5/7.
 */

//父类
public class Account {
    //账户
    private String actno;
    //余额
    private double banlance;

    Account() {}
    Account(String actno, double banlance ) {
        this.actno = actno;
        this.banlance = banlance;
    }
    //setter and getter
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
}
