package com.ty.com.base.alo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * created by TY on 2018/5/16.
 * */
public class TimeRetalted {
    public static void main(String[] args) throws Exception {
        long now = System.currentTimeMillis();
        System.out.println(now);

        //获取系统时间
        Date nowTime = new Date();
        System.out.println(nowTime);
        //格式化DATE  Date->String
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
        String s = sdf.format(nowTime);
        System.out.println(s);

        //获取特定的日期  String->Date
        String strTime = "2008年08月08日 08:08:08 888";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
        Date d = simpleDateFormat.parse(strTime);
        System.out.println(d);

        Date date = new Date(1000);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy,MM,dd, HH:mm:ss SSS");
        System.out.println(sdf2.format(date));
        //获取当前系统时间的前十分钟
        Date date1 = new Date(System.currentTimeMillis() - 1000*60*10);
        System.out.println(sdf2.format(date1));

        //获取系统当前的日历
        Calendar c = Calendar.getInstance();
        //查看当前日历的星期几
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        //获取2008，08，08 星期几
        String time = "2008,08,08";
        Date date2 = new SimpleDateFormat("yyyy,MM,dd").parse(time);
        c.setTime(date2);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
    }
}

/*       1526469783769
        Wed May 16 19:23:03 CST 2018
        2018年05月16日 19:23:03 771
        Fri Aug 08 08:08:08 CST 2008
        1970,01,01, 08:00:01 000
        2018,05,16, 19:13:03 799
        4
        8
*/
