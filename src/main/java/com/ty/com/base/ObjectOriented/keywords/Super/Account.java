package com.ty.com.base.ObjectOriented.keywords.Super;

/**
 * created by TY on 2018/5/8.
 */
public class Account {
    String actno;
    double banlance;

    //Coustructor
    Account() {
        System.out.println("父类无参数的构造方法");
    }
    Account(String actno, double banlance) {
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
