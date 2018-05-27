package com.ty.com.base.reflect;

/**
 * created by TY on 2018/5/27.
 */


import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


/**
 * field
 * @param
 * @return
 */
public class FieldReflectTest {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("com.ty.com.base.reflect.User");

//        //public field
//        1
//        age
//        Field[] fs = c.getFields();
//        System.out.println(fs.length);
//        System.out.println(fs[0].getName());

        Field[] fs = c.getDeclaredFields();
        for(Field field:fs) {
            int i = field.getModifiers();
            String strModigier = Modifier.toString(i);
            System.out.println(strModigier);

            Class type = field.getType();
            System.out.println(type.getName());
            System.out.println(type.getSimpleName());
            System.out.println(field.getName());

        }
    }
}
    /*
    private
    java.lang.String
    String
    id


    public
    int
    int
    age


    protected
    java.lang.String
    String
    addr

    boolean
    boolean
    sex*/