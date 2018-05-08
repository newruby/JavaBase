package com.ty.com.base.ObjectOriented.keywords.Super;

/**
 * created by TY on 2018/5/8.
 */

/**
 * super用在构造方法中
 */
public class DebitAccount extends Account{
    //信誉度
    double debit;

    DebitAccount() {
//     super();调用父类无参数的构造方法
        super("001",100);
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getDebit() {
        return debit;
    }
}
