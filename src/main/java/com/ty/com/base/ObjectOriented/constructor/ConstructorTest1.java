package com.ty.com.base.ObjectOriented.constructor;

/**
 * created by TY on 2018/5/6.
 */

/*User*/
public class ConstructorTest1 {
    public static void main(String[] args) {
        //作用1.创建User类型的对象(其实是调用无参数的构造函数)
        User u1 = new User();
        //有参数的构造函数
        // 2.初始化成员变量
        User u2 =new User(10);
        User u3 =new User("shelly");
        User u4 =new User("shelly",13);

        System.out.println(u1.age);
        System.out.println(u1.name);
        System.out.println(u2.age);
        System.out.println(u2.name);
        System.out.println(u3.age);
        System.out.println(u3.name);

    }

}
