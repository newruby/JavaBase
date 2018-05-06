package com.ty.com.base.ObjectOriented.constructor;

/**
 * created by TY on 2018/5/6.
 */
public class User {

    //成员变量
    String name;
    int age;

    //定义构造方法(构造方法构成了重载)
    User() { //建议手动写上无参数的构造方法
        //System.out.println("User的无参数构造方法调用");
        /*  等价于执行
        * age = 0;
        * name = null;
        * 对成员变量进行赋值*/
    }
    /**
     //有参数的构造方法
     User(int age) {
     System.out.println(age);
     }
     */
    User(int _age) {
        age = _age;
    }
    User(String _name) {
        name = _name;
    }
    User(String _name, int _age) {
        name = _name;
        age = _age;
    }

}
