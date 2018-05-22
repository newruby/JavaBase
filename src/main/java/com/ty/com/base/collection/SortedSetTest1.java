package com.ty.com.base.collection;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * created by TY on 2018/5/22.
 */

/**
 * 日期放入SortedSet
 */
public class SortedSetTest1 {
    public static void main(String[] args) throws Exception {
        //日期Date
        String st1 = "2018-1-1";
        String st2 = "2018-2-1";
        String st3 = "2018-3-1";
        String st4 = "2018-4-1";
        String st5 = "2018-5-1";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date d1 = sdf.parse(st1);
        Date d2 = sdf.parse(st2);
        Date d3 = sdf.parse(st3);
        Date d4 = sdf.parse(st4);
        Date d5 = sdf.parse(st5);

        SortedSet times = new TreeSet();

        times.add(d1);
        times.add(d2);
        times.add(d3);
        times.add(d4);
        times.add(d5);

        Iterator it = times.iterator();
        while(it.hasNext()) {
            Object element = it.next();
            if(element instanceof Date) {
                Date d = (Date) element;
                System.out.println(sdf.format(d));
            }
        }
    }
}
