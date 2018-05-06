package com.ty.com.base.ObjectOriented.Class;

/**
 * created by TY on 2018/5/6.
 */

/*
面向对象的封装性
Customer
 */
public class OOTest2 {
    public static void main(String[] args) {
        //创建customer类型的对象
        Customer c = new Customer();

/*        //读取(get)
        System.out.println(c.age);

        //赋值(set)
        c.age = 10;
//      c.age = -10;是不合法的数据，因为age属性没有任何限制，导致外部程序可以随意访问不安全

        //读取
        System.out.println(c.age);
*/
        c.setAge(10);
        System.out.println(c.getAge());

        c.setAge(-10);//print invalid age
        System.out.println(c.getAge());
    }
}

