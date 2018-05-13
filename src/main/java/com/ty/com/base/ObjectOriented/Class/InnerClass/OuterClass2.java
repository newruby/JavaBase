package com.ty.com.base.ObjectOriented.Class.InnerClass;

/**
 * created by TY on 2018/5/12.
 */

/**
 *成员内部类
 * @param
 * @return
 */
public class OuterClass2 {
    //静态变量
    private static String s = "neo got my back";
    //成员变量
    private String s2 = "tech tech on my mind ";
    //静态方法
    private static void m1() {
        System.out.println("static 'm1 invoke");
    }
    //成员方法
    private void m2() {
        System.out.println("m2 invoke");
    }
    /**
     *成员内部类不能有静态声明
     * @param
     * @return
     */
    class InnerClass {
        //静态方法
/*        public static void m3() {
            System.out.println(s);
            m1();
        }*/
        //成员方法
        public void m4() {
            //可以访问外部类的所有数据静态成员数据
            System.out.println(s);
            System.out.println(s2);
            m1();
            OuterClass2 o = new OuterClass2();
            o.m2();
        }
    }
    public static void main(String[] args) {
        //创建外部类的对象
        OuterClass2 oc = new OuterClass2();
        //创建内部类的对象
        InnerClass ic = oc.new InnerClass();
        ic.m4();
    }
}
/*
neo got my back
tech tech on my mind
static 'm1 invoke
m2 invoke
*/