package com.ty.com.base.collection;

/**
 * created by TY on 2018/5/26.
 */

import javax.swing.*;
import java.util.*;

/**
 * 泛型在编译阶段统一集合中的类型
 * @param
 * @return
 */
public class GenericTest1 {

    public static void main(String[] args) {
        //创建一个只能存储字符串类型的LIST集合
        List<String> strs = new ArrayList<String>();
        strs.add("The 7th Sense");
        strs.add("Limitless");
        strs.add("Chain");
        Iterator<String> it = strs.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //Map使用泛型
        Map<String, Integer> maps = new HashMap<String, Integer>();

        maps.put("The 7th Sense",7);
        maps.put("Limitless",9);
        maps.put("Chain",9);

        Set<String> keys = maps.keySet();
        Iterator<String> it1 = keys.iterator();
        while(it1.hasNext()) {
            String k = it1.next();
            Integer v = maps.get(k);
            System.out.println(k +"--------" + v);
        }
        //SortedSet使用泛型

        SortedSet<Workers> ss = new TreeSet<Workers>();
        Workers w1 = new Workers(1000.0);
        Workers w2 = new Workers(2000.0);
        Workers w3 = new Workers(3000.0);

        ss.add(w1);
        ss.add(w2);
        ss.add(w3);

        Iterator<Workers> iterator = ss.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
//注意这里Comparable<Workers>
class Workers implements Comparable<Workers> {
    double salary;

    Workers(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  salary + "" ;
    }

    @Override
    public int compareTo(Workers o) {
        double sal1 = this.salary;
        double sal2 = o.salary;//不需要强制转换
        if(sal1 < sal2) {
            return -1;
        }else if (sal1 > sal2) {
            return 1;
        }
        return 0;
    }
}

        /*
        The 7th Sense
        Limitless
        Chain
        Limitless--------9
        Chain--------9
        The 7th Sense--------7
        1000.0
        2000.0
        3000.0*/
