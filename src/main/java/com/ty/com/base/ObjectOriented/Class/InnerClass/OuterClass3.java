package com.ty.com.base.ObjectOriented.Class.InnerClass;

/**
 * created by TY on 2018/5/13.
 */
/**
 *局部内部类
 * @param
 * @return
 */
public class OuterClass3 {
    //局部内部类访问局部变量 局部变量必须使用final修饰
    final int i = 10;

    public void m1() {
        /**
         *局部内部类等同于局部变量(所以要在方法里写不能用访问控制权限修饰符修饰)
         * @param
         * @return
         */
        class InnerClass {
            //不能有静态声明
            /*public static void m2(){}*/
            public void m2() {
                System.out.println(i);
            }
        }
        //调用局部内部类的方法先在外部类的方法里调用 否则出去这个方法就无效
        InnerClass ic = new InnerClass();
        ic.m2();
    }

    public static void main(String[] args) {
        //调用外部类的方法
        OuterClass3 oc = new OuterClass3();
        oc.m1();
    }

}
