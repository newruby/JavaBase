package com.ty.com.base.collection;

import com.sun.xml.internal.ws.wsdl.parser.MemberSubmissionAddressingWSDLParserExtension;

import java.util.*;

/**
 * created by TY on 2018/5/26.
 */

/**
 *存储在Map集合key不分的元素需要同时重写hashCode  equals
 * @param
 * @return
 */
public class MapTest1 {
    public static void main(String[] args) {
        //创建Map集合
        Map persons = new HashMap();

        //存储键值对
        persons.put("rookies1","TY");
        persons.put("rookies001","TY");
        persons.put("rookies009","JW");
        persons.put("rookies001","TY Track");

        //判断键值对的个数
        //Map中的key是无序不可重复的和HasSet相同
        System.out.println(persons.size());

        //判断集合中是否包含这样的Key
        System.out.println(persons.containsKey("rookies1"));

        //判断集合中是否包含这样的Value
        //如果key重复Value采用的是覆盖
        System.out.println(persons.containsValue("TY Track"));

        //通过key获取value
        String k = "rookies009";
        Object v = persons.get(k);
        System.out.println(v);

        //通过key删除键值对
        persons.remove("rookies009");
        System.out.println(persons.size());

        //获取所有的value
        Collection values = persons.values();
        Iterator it = values.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //获取所有的key  并且遍历Map
        Set keys = persons.keySet();

        Iterator it2 = keys.iterator();

        while (it2.hasNext()) {
            Object id = it2.next();
            Object name = persons.get(id);
            System.out.println(id + "--->" + name);
        }

        //entrySet 将Map转换Set
        Set entrySet = persons.entrySet();
        Iterator it3 = entrySet.iterator();
        while(it3.hasNext()) {
            System.out.println(it3.next());
        }
    }
}
        /*3
        true
        true
        JW
        2
        TY
        TY Track
        rookies1--->TY
        rookies001--->TY Track
        rookies1=TY
        rookies001=TY Track*/