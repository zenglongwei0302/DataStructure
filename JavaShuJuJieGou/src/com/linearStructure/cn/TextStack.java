package com.linearStructure.cn;
/**
 *
 * 数组实现栈
 *
 * */
public class TextStack {

    int[] elements;

    public TextStack() {
        elements = new int[0];
    }


    //压入元素
    public void push(int element) {

        //创建一个数组,比原数组多一个元素。
        int[] newArr = new int[elements.length + 1];

        //把原数组中的元素复制到新的数组中。
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }

        //把添加的元素放在新的数组中
        newArr[elements.length] = element;

        //改变指向
        elements = newArr;
    }

    //取出栈顶元素。
    public int pop() {
        //判断栈是否为空。
        if (this.isempty()) {
            throw new RuntimeException("stack is empty");
        }

        //取出数组的最后一个元素。
        int element = elements[elements.length - 1];
        //创建一个数组，比原数组少一个元素。

        int[] newArr = new int[elements.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = elements[i];

        }

        elements = newArr;

        //返回栈顶元素。
        return element;
    }

    //查看栈顶元素。
    public int pick() {
        if (this.isempty()) {
            throw new RuntimeException("stack is empty");
        }
        return elements[elements.length - 1];
    }

    //判断栈是否为空

    public boolean isempty() {
        return elements.length == 0;
    }


}
