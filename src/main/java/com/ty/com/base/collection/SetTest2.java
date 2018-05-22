package com.ty.com.base.collection;

/**
 * created by TY on 2018/5/21.
 */

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Set;

/**
 *存储在HashSet集合或者HashMap集合key部分的元素，需要同时重写hashCode、equals方法
 * @param
 * @return
 */
public class SetTest2 {
    public static void main(String[] args) {
        Set s = new HashSet();

        Employee e1 = new Employee("001", "ty");
        Employee e2 = new Employee("001", "ty");
        Employee e3 = new Employee("009", "JW");
        Employee e4 = new Employee("018", "lucas");

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e3.hashCode());

        s.add(e1);
        s.add(e2);
        s.add(e3);
        s.add(e4);

        System.out.println(s.size());

    }
}

    /*
    47665
    47665
    47673
    3*/
