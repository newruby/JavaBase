package com.ty.com.base.alo;

/**
 * created by TY on 2018/5/14.
 */
/**
 * StackOperationError
 * Stack
 * @param
 * @return
 */
public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Idol idol1= new Idol("ty","nct");
        Idol idol2= new Idol("dy ","nct");
        Idol idol3= new Idol("jw ","nct");
        Idol idol4= new Idol("mino","winner");
        Idol idol5= new Idol("jisoo","bp");
        Idol idol6= new Idol("jisoo","bp");
        try {
            stack.push(idol1);
            stack.push(idol2);
            stack.push(idol3);
            stack.push(idol4);
            stack.push(idol5);
            stack.push(idol6);

        }catch(StackOperationError e) {
            e.printStackTrace();
        }
        try {
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());

        }catch(StackOperationError e) {
            e.printStackTrace();
        }

    }
}

class Idol {
    String name;
    String group;

    Idol() {};
    Idol(String name, String group) {
        this.name = name;
        this.group = group;
    }

    @Override
    public String toString() {
        return "name " + this.name +" group " + this.group;
    }
}