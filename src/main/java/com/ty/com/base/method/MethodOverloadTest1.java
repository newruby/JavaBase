package com.ty.com.base.method;

/**
 * created by TY on 2018/5/6.
 */
public class MethodOverloadTest1 {
    public static void main(String[] args) {
        System.out.println(Compute.sum(10, 20));
        System.out.println(Compute.sum(1.0, 2.0));
        System.out.println(Compute.sum(10L, 20L));

    }
    //方法的重载和方法的返回值类型无关
    /*
     *  public static void m1() {}
     *  public static int m1() {
     *      return 100;
     *  }
     */
    //方法的重载和方法的修饰符列表无关
    /*
     * static void m2() {}
     *  public static int m2() {}
     */
}

class Compute {
    public static int sum(int a, int  b) {
        return a + b;
    }
    public static double sum(double a, double  b) {
        return a + b;
    }
    public static long sum(long a, long  b) {
        return a + b;
    }
}