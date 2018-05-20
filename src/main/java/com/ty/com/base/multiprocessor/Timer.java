package com.ty.com.base.multiprocessor;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.TimerTask;

/**
 * created by TY on 2018/5/20.
 */
public class Timer {
    public static void main(String[] args) throws Exception{

        new Timer().schedule(new LogTimerTask(),
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2018-5-20 12:13:00 000"),
                  10*1000);
    }
}
class LogTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
    }
}
