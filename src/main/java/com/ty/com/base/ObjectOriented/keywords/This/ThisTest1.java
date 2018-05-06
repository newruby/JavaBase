package com.ty.com.base.ObjectOriented.keywords.This;

/**
 * created by TY on 2018/5/6.
 */
/**
  this 关键字
*/
public class ThisTest1 {
    public static void main(String[] args) {

        /*Employee类*/
        //创建对象
        Employee e = new Employee(711, "TONEY");

        //工作
        e.work();

        e.m1();

        /*MyDate类*/
        //创建对象
        MyDate t1 = new MyDate();
        System.out.println(t1.year + "年" + t1.month + "月" + t1.day + "日");
        //       MyDate t2 = new MyDate(1995,7,1);
        //       System.out.println(t2.year + "年" + t2.month + "月" + t2.day + "日");
    }
}




/**
  this 关键字
  用在成员方法中
  this指的就是当前对象
*/
class Employee {
    //员工编号
    int empno;

    //员工名
    String ename;

    Employee(){}

    Employee(int _empno,String _ename) {
        empno = _empno;
        ename = _ename;

    }

    //提供一个员工工作的方法
    //this用在成员方法中，谁去调用这个成员方法，this就代表谁
    //this指的就是当前对象
    public void work() {

        System.out.println(this.ename + "在工作");
        //System.out.println(ename + "在工作");this.可以省略
    }
    //成员方法
    public void m1() {
        this.m2();//引用.

        m2();//this.可以省略
    }
    //成员方法
    public void m2() {
        System.out.println("TESTITNG");
    }
}

//日期
/**
  this 关键字
  用在构造方法中
  通过一个构造方法去调用另一个构造方法
*/
class MyDate {
    int year;
    int month;
    int day;

    //Constructor
    //需求：在创建日期对象的时候，默认的日期是1970-1-1
    MyDate() {
        this(1997,1,1);
/*   等价于
        this.year = 1997;
        this.month = 1;
        this.day = 1;
*/
    }

    MyDate(int _year, int _month, int _day) {

        year = _year;
        month = _month;
        day = _day;

    }

}