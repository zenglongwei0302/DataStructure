package com.linearStructure.cn;
/**
 * 双向循环链表
 *
 * */
public class DoubleLinkedList {
    DoubleLinkedList pre = this;
    DoubleLinkedList next = this;
    int data;

    public DoubleLinkedList(int data) {
        this.data = data;
    }

    //插入节点
    public void after(DoubleLinkedList doubleLinkedList) {

        //获取下一个节点
        DoubleLinkedList nextNext = this.next;
        //将新节点设置为当前节点的下一个节点
        this.next = doubleLinkedList;
        //将新节点的前一个节点设置为当前节点
        doubleLinkedList.pre = this;
        //将获取到的下一个节点设置为新节点的下一个节点
        doubleLinkedList.next = nextNext;
        //将下一个节点的上一个节点设置为新节点
        nextNext.pre = doubleLinkedList;

    }


    //获取下一个节点
    public DoubleLinkedList getNext() {
        return this.next;
    }


    //获取上一个节点
    public DoubleLinkedList getPre() {
        return this.pre;
    }

    //获取当前节点数据
    public int getData() {
        return this.data;
    }

}
