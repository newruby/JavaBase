package com.ty.com.base.ObjectOriented.keywords.Static;

/**
 * created by TY on 2018/5/6.
 */
/**
 * static修饰的方法静态方法
*/
public class StaticTest3 {
    //成员方法
    //必须使用引用.调用
    public void m1() {

    }
    //静态方法
    //可以使用类名.调用
    //静态方法中不能直接访问非静态数据（成员变量 成员方法）
    //静态方法不能使用this

    public static void m2() {

    }
    public static void main(String[] args) {
        StaticTest3 st =new StaticTest3();
        st.m1();

        m2();

/*      st.m2();

        StaticTest3 s = null;
        s.m2();
可以执行通过但实际类名.调用
*/
    }
}
