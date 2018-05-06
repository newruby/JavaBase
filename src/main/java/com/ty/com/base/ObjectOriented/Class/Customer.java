package com.ty.com.base.ObjectOriented.Class;

/**
 * created by TY on 2018/5/6.
 */

/*封装
  1.属性私有化
    2.对外提供公开的方法setter getter
*/


public class Customer {
    //属性
    //成员变量，实例变量，非静态变量
//    int age;是不合法的数据，因为age属性没有任何限制，导致外部程序可以随意访问不安全
//    private修饰的数据只能在本类中访问
    private int age;

    //对外提供两个公开的方法
    //set赋值
    public void setAge(int _age) {
        //安全控制
        if(_age < 0 || _age > 100) {
            System.out.println("invalid age");
            return;
        }
        age = _age;
    }

    //get读取
    public int getAge() { //成员方法，实例方法，非静态方法
        //成员方法必须使用“引用.”方式访问
        return age;
    }


}
