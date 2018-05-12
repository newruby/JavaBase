package com.ty.com.base.ObjectOriented.ObjectMethod.equals;

/**
 * created by TY on 2018/5/12.
 */
/**
 * Object的equals方法比较两个引用的内存地址，判断两个对象是否一样
 * String已重写该方法比较内容是否一样
 * @param
 * @return
 */
public class Test {
    public static void main(String[] args) {
        Object o1 =new Object();
        Object o2 =new Object();
        System.out.println(o1.equals(o2));//false


        Star s1 = new Star("TY", 001);
        Star s2 = new Star("TY", 001);
        System.out.println(s1.equals(s2));//true

    }
}
class Star{
    String name;
    int id;

    Star() {}
    Star(String name, int id) {
        this.name = name;
        this.id = id;
    }

    /**
     *    注意一下重写equals
     *    判断.id .name
     * @param
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {return true;}
        //强制类型转换因为obj没有name id
        else if(obj instanceof Star){
            Star star = (Star)obj;
            if((star.id == id) && star.name.equals(name)) {
                return true;
            }
        }
        return false;
    }
}