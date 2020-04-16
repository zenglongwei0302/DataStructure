package com.linearStructure.cn;
/**
 *循环链表
 *
 **/
public class CircularLinkedList {

    //节点内容（数据）
    int data;

    //下一个节点
    CircularLinkedList next = this;

    public CircularLinkedList(int data) {
        this.data = data;
    }


    //插入一个节点为当前节点的下一个节点
    public void after(CircularLinkedList node) {
        //取出下一个节点作为下下个节点
        CircularLinkedList nextNext = this.next;

        //把下个节点作为新节点的下一个节点
        node.next = nextNext;

        //把新节点作为下一个节点
        this.next = node;

    }

    //删除下一个节点
    public void remove() {

        //取出下下个节点
        CircularLinkedList newNext = next.next;

        //把下下个节点设置为当前节点的下一个节点
        this.next = newNext;
    }

    //获取下一个节点
    public CircularLinkedList getNext() {
        return this.next;
    }


    //获取节点数据
    public int getData() {
        return this.data;
    }

}
