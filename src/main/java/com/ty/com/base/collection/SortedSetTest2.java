package com.ty.com.base.collection;

/**
 * created by TY on 2018/5/22.
 */

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * SortedSet集合存储元素为什么可以自动排序
 * Sun提供的程序调用compareTo
 * 所以第一种方法 重写该方法
 * @param
 * @return
 */
public class SortedSetTest2 {
    public static void main(String[] args) {
        SortedSet s = new TreeSet();

        User u1 = new User(10);
        User u2 = new User(30);
        User u3 = new User(20);

        s.add(u1);
        s.add(u2);
        s.add(u3);

        Iterator it = s.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }


    }
}

class User implements Comparable {
    String name;

    int age;
    User(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User(age = "+ age + ")";
    }

    //实现java.lang.Comparable接口中得compareTo方法
    //该方法程序员负责实现
    //编写一个比较规则age排序
    @Override
    public int compareTo(Object o) {
        int age1 = this.age;
        int age2 = ((User)o).age;
       //升序
        return age1 - age2;

    }

}

    /*User(age = 10)
    User(age = 20)
    User(age = 30)*/