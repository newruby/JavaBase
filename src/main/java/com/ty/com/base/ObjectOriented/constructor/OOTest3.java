package com.ty.com.base.ObjectOriented.constructor;

import com.ty.com.base.ObjectOriented.constructor.User;

/**
 * created by TY on 2018/5/6.
 */

/**
  对象没有更多的引用指向，则变成垃圾
 */
public class OOTest3 {
    public static void main(String[] args) {
        //u1是引用，保存内存地址指向堆中的对象
        User u1 = new User();
        //程序执行到此处，u1不再指向堆中的对象
        //对象变成了垃圾
        u1 = null;

        //使用一个空的引用去访问【成员】，会出现？
        System.out.println(u1.name);//编译可以通过  java.lang.NullPointerException空指针异常

//another example
        Star s = new Star();
        s = null;
        s.sing();//编译可以通过  java.lang.NullPointerException空指针异常
    }
}

class Star {
    //成员方法
    public void sing() {
        System.out.println("Sing a song");
    }
}