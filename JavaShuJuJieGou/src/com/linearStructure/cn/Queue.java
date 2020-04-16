package com.linearStructure.cn;

/**
 * 用数组实现队列
 *
 * */

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Queue {

    int[] elements;

    public Queue() {
        elements = new int[0];
    }

    //排入一个元素
    public void add(int element) {
        //创建一个数组,比原数组多一个元素。
        int[] newArr = new int[elements.length + 1];

        //把原数组中的元素复制到新的数组中。
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }

        //把添加的元素放在新的数组中
        newArr[elements.length] = element;
        elements = newArr;
    }

    //取出一个元素
    public int poll() {
        if (this.isEmpty()) {
            throw new RuntimeException("the Queue is empty");
        }

        //取出队列第一个元素
        int element = elements[0];

        //创建一个数组，长度是原数组长度-1
        int[] newArr = new int[elements.length - 1];

        //把复制原数组到新数组里面
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = elements[i + 1];
        }

        //改变指向
        elements = newArr;

        return element;
    }

    //判断队列是否为空
    public boolean isEmpty() {
        return elements.length == 0;
    }

}
