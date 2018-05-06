package com.ty.com.base.ObjectOriented.Class;

/**
 * created by TY on 2018/5/6.
 */

//如何创建和适用对象
// Student
public class OOTest1 {
    public static void main(String[] args) {
        //1.创建对象
        //stu1是一个局部变量，是Student类型也就是一个引用类型
        // 该局部变量称为引用，保存了对象在堆中的内存地址
        //通过引用去间接访问堆中的对象
        Student stu1 = new Student();
        //一个类可以创建多个对象
        //Student stu2 = new Student();

        //2.使用对象
        //访问成员变量，必须使用“引用.”

        System.out.println("id = " + stu1.id);
        System.out.println("name = " + stu1.name);
        System.out.println("age = " + stu1.age);
        System.out.println("sex = " + stu1.sex);
        System.out.println("address = " + stu1.addr);


        //赋值
        stu1.id = 100;

/*        系统默认值：
            基本数据类型
                    byte,short,int,long 0
                    float,double 0.0
                    boolean false
                    char \u0000
             引用数据类型    null*/


    }
}
