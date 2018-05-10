package com.ty.com.base.ObjectOriented.keywords.Super;

/**
 * created by TY on 2018/5/8.
 */

/**
 * super用在构造方法中
 */
public class DebitAccount extends Account{
    //信誉度 特有的属性
    private double debit;

    DebitAccount() {
        /*
        *   一个构造方法第一行没有this(..) 也[]显示的调用super(...)默认调用super()
        */
//     super();调用父类无参数的构造方法
    }
    //通过子类的构造方法去调用父类的构造方法，作用是给当前子类对象中的父类型特征赋值
    DebitAccount(String actno, double banlance, double debit ) {
        super("001",100);
        this.debit = debit;
    }


    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getDebit() {
        return debit;
    }
}
