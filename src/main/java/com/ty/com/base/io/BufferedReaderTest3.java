package com.ty.com.base.io;

/**
 * created by TY on 2018/5/26.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 接受用户键盘的输入
 * @param
 * @return
 */
public class BufferedReaderTest3 {
    public static void main(String[] args) throws Exception{
        //以前的方式
        Scanner s = new Scanner(System.in);

        String str = s.next();

        System.out.println(str);

        //使用BufferedReader
        //System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        System.out.println(str1);

        br.close();

    }
}
