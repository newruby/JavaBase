package com.ty.com.base.ObjectOriented.polymorphism;

/**
 * created by TY on 2018/5/8.
 */

/**
 * Animal.java
 * Dog.java
 * Cat.java
 * 多态:父类型引用对象指向子类型引用对象
 * @param \
 * @return
 */
public class Test1 {
    public static void main(String[] args) {
        //向上转型（自动类型转换）     子类->父类 父类型的引用指向子类对象
        //程序在编译阶段被编译器看作Animal类型
        //程序在编译阶段a1引用绑定的是Animal类中的eat方法（静态绑定）
        //程序在运行时堆中的对象实际是Cat类型，而Cat中的eat方法已经重写
        //程序在运行阶段对象绑定的方法是Cat中的eat方法（动态绑定）
        Animal a1 = new Cat();
        a1.eat();//console:猫在吃鱼

        //向下转型（ 强制类型转换）
        //加强制类型转换符
        Animal a2 = new Cat();
        Cat c1 = (Cat) a2;
        c1.move();
//以下程序会出现什么问题的说法
//        Animal a3 = new Dog();
//        Cat c2 = (Cat) a3;//console:java.lang.ClassCastException

        //在做强制转换时程序是存在风险的
        //instanceof 运算符的运算结果是boolean类型
        //（引用  instanceof 类型 ）-> true/flase
        //例如 a instanceof Cat结果是true，表示a引用指向的java对象是Cat类型
        Animal a4 = new Dog();
        System.out.println(a4 instanceof Cat);//false
        if(a4 instanceof Cat) {
            Cat c3 = (Cat) a4; //并不执行所以避免发生java.lang.ClassCastException
        }




    }
}
