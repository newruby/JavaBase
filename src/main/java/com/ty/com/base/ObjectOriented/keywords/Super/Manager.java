package com.ty.com.base.ObjectOriented.keywords.Super;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * created by TY on 2018/5/8.
 */

/**
 * super代表当前子类对象中父类型特征

 *super可以用在成员方法中不能用在静态方法中
 *super可以用在构造方法中
 * @param
 * @return
 */
public class Manager extends Employee {
    String name = "NCT";

    @Override
    public void work() {
        System.out.println("经理在工作");
    }

    //成员方法
    public void m1() {

        work();
        this.work();
        super.work();

        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);

    }
/*    super和this一样都不能用在静态方法中
public static void m2() {
        System.out.println(super.name);
    }
 */




}
