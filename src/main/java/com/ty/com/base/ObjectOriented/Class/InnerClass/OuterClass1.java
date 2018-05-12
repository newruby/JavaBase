package com.ty.com.base.ObjectOriented.Class.InnerClass;

/**
 * created by TY on 2018/5/12.
 */
/**
 * 内部类类内定义类可以访问外部类中私有的数据r
 *  静态内部类
 * @param
 * @return
 */
public class OuterClass1 {
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
     *  静态内部类可以用访问控制权限的修饰符
     *  public protected private 缺省
     *  静态内部类可以直接访问静态数据  静态变量 静态方法
     *  无法直接访问成员数据  成员变量 成员方法
     * @param
     * @return
     */
    //静态方法
    static class InnerClass {
        public static void m3() {
            System.out.println(s);
            m1();
        }
        //成员方法
        public void m4() {
            System.out.println(s);
            m1();
        }
    }
    public static void main(String[] args) {
        OuterClass1.InnerClass.m3();

        InnerClass inner = new InnerClass();
        inner.m4();
    }
}
/*
neo got my back
static 'm1 invoke
neo got my back
static 'm1 invoke
*/