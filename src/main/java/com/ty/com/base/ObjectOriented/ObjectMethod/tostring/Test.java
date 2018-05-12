package com.ty.com.base.ObjectOriented.ObjectMethod.tostring;

/**
 * created by TY on 2018/5/12.
 */
/**
 * Object的toString方法返回java对象的字符串形式
 * 实际开发中要被重写
 * @param
 * @return
 */
public class Test {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(o.toString());//java.lang.Object@1540e19d
        Person p = new Person("TY", 20);
        //System.out.println一个引用类型默认调用该引用类型toString方法
        System.out.println(p);
//      System.out.println(p.toString());

    }
}

class Person {
    String name;
    int age;

    Person() {}
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "name:" + this.name + "  age:" + this.age;

    }

}