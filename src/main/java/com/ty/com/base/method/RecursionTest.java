package com.ty.com.base.method;

/**
 * created by TY on 2018/5/6.
 */
public class RecursionTest {
    public static void main(String[] args) {
        // 调用方法1
        int n = 5;
        int result = m1(n);
        System.out.println(result);
        // 调用方法2
        System.out.println(m2(5));
    }


    //1-N求和
    public  static int m1(int n) {
       if(n == 1) {
           return 1;
       }else{
           return  n + m1(n - 1);
       }
    }

    //计算N阶乘
    public static int  m2(int n) {
        // 不使用递归
/*        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;*/
        //递归
        if(n == 1) {
            return 1;
        }else {
            return n * m2(n - 1);
        }
    }

}
