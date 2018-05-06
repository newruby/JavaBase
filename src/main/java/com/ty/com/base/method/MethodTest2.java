package com.ty.com.base.method;

/**
 * created by TY on 2018/5/6.
 */
public class MethodTest2 {
    //入口
    public static void main(String[] args){
        //方法调用
        MethodTest2.println("Hello TY");//Hello TY实际参数（实参）
        MethodTest2.m1(100, 50);

    }
    //方法的定义
// 方法的形式参数列表中起决定性作用的是参数的类型
    //参数的名字（局部变量的名字）随意只要是合法的标识符
    /**
     *
     * @param msg
     * @return void
     */
    public static void println(String msg){
        System.out.println(msg);//msg是形式参考（形参）
    }
    public static  void m1(int a, int b){
        System.out.println(a + "+" + b + "=" + (a+b));
    }
}
