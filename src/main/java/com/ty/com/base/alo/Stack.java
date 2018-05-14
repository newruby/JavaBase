package com.ty.com.base.alo;

/**
 * created by TY on 2018/5/14.
 */
public class Stack {
    //利用数组存储元素
    Object[] elements;
    Object element;

    //指示栈顶上一个元素
    int index;
    //Constructor 默认容量5
    Stack() {
        this(5);
    }
    Stack(int max) {
        elements = new Object[max];
    }

    //push
    //写完方法处理异常
    public void push(Object element) throws StackOperationError {
        if(index == elements.length) {
            throw new StackOperationError("栈已满");
        }else {

//      elements[index] = element;
//      index++;
            elements[index++] = element;
        }
    }

    //pop
    public Object pop() throws StackOperationError {
        if(index == 0) {
            throw new StackOperationError("栈已空");
        }else {
//      index--;
//      element = elements[index];
        element = elements[--index];
        return element;
        }
    }
}
