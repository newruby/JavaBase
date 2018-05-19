package com.ty.com.base.alo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

/**
 * created by TY on 2018/5/19.
 */
public class NumberRelated {
    public static void main(String[] args) {
        //创建数字格式化对象
        //加入千分位 保留两位4位小数，并且不够补0
        DecimalFormat df = new DecimalFormat("###,###.0000");
        //开始格式化
        //Number -> String
        System.out.println(df.format(123456.789));

        BigDecimal b1 = new BigDecimal(10);
        BigDecimal b2 = new BigDecimal(20);
        //引用类型调用方法做加法运算
        System.out.println(b1.add(b2));

        //创建一个新的随机数生成器
        Random r = new Random();
        //生成Int类型的随机数 [0, 101)
        int i = r.nextInt(101);
        System.out.println(i);

        //循环生成5个随机数
        for(int k = 0; k < 5; k++) {
            System.out.println(r.nextInt(10));
        }
        //循环生成5个 不重复随机数




        int a = 10;
        int b =10;

        Result result = divide(a, b);
        if(result == Result.SUCCESS) {
            System.out.println("成功");
        }else if (result == Result.FAIL) {
            System.out.println("失败");
        }
    }

    //定义一个方法，该方法的作用是计算两个int类型数据的商如果计算成功则返回1，如果执行失败则返回0
    public static Result divide (int a, int b) {
        try {
            int c = a / b;
            return Result.SUCCESS;
        }catch(Exception e) {
            return Result.FAIL;
        }
    }
}
//枚举类型 大写有限
enum Result {
    SUCCESS,FAIL
}
        /*
        123,456.7890
        30
        13
        3
        9
        9
        2
        1
        成功
        */
