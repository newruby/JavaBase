package com.ty.com.base.method;

/**
 * created by TY on 2018/5/6.
 */
public class MethodTest3 {
    //入口
    public static void main(String[] args){
        A.m1();

        //Error:在当前类中没有m1方法
        //m1();

        MethodTest3.m2();

        //前提：在当前类中
        //类名可以省略
        m2();

        m3(0);
        //return一旦执行方法结束
        // 程序可以编译通过  因为程序编译阶段认为可能执行可能不执行
        if(true){
            return;
        }

        System.out.println("lalla");

    }

    public static void m2(){
        System.out.println("m2...");
    }

    public static void m3(int i){
        for(; i < 10; i++){
            if(i == 5) {
                return;//结束返回值类型是void的方法 hello不输出
//                break;  可以输出hello
            }
            System.out.println(i);
        }
        System.out.println("Hello");
    }

}
class A{
    public static void m1(){
        System.out.println("A 's m1 method invoke! ");
    }
}
