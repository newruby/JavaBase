package com.ty.com.base.collection;

/**
 * created by TY on 2018/5/19.
 */
public class ForeachTest {
    public static void main(String[] args) {
        String[] ins ={"eat", "idol", "music"};
        StringBuffer stringBuffer = new StringBuffer();
        for(int i =0; i < ins.length; i ++) {
            if(i == ins.length -1) {
                stringBuffer.append(ins[i]);
            }else {
                stringBuffer.append(ins[i]);
                stringBuffer.append(",");
            }
        }
        System.out.println(stringBuffer);
        //foreatch
        StringBuffer sb = new StringBuffer();
        for(String s:ins) {
            sb.append(s);
            sb.append(",");
        }
        System.out.println(sb.substring(0, sb.length() - 1));
    }
}
