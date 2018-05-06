package com.ty.com.base.method;



/**
 * created by TY on 2018/5/6.
 */
public class MethodTest1 {
    public static void main(String[] args){
//            注意：加有static的方法，调用的时候必须采用“类名.”的方式调用
        MethodTest1.sumInt(10, 20);
    }

    //定义方法，完成两个整数的求和
    //注意：目前所有的方法定义成public static???
    /**
     *
     * @param a, b
     * @return void
     */
    public static void  sumInt(int a, int b){
        int c = a + b;
        System.out.println(a + "+" + b + "=" + c);
    }
}
