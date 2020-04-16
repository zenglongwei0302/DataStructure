package com.linearStructure.cn;
/**
 *
 * 节点直接实现单链表
 *
 * */
public class Node {

    //节点内容（数据）
    int data;
    //下一个节点
    Node next;

    public Node(int data) {
        this.data = data;
    }

    //为节点追加节点
    public Node append(Node node) {
        //获取当前节点
        Node currentNode = this;
        //循环向后找
        while (true) {
            //取出下一个节点
            Node nextNode = currentNode.next;

            //如歌下一个节点为NULL，跳出循环，表面是最后一个节点
            if (nextNode == null) {
                break;
            }

            //将下一节点赋给当前节点
            currentNode = nextNode;
        }
        //把需要追加的节点赋值给当前节点的next，表面需要追加的节点为最后一个节点。
        currentNode.next = node;
        return this;
    }

    //插入一个节点为当前节点的下一个节点
    public void after(Node node) {
        //取出下一个节点作为下下个节点
        Node nextNext = this.next;

        //把下个节点作为新节点的下一个节点
        node.next = nextNext;

        //把新节点作为下一个节点
        this.next = node;

    }

    //删除下一个节点
    public void remove() {

        //取出下下个节点
        Node newNext = next.next;

        //把下下个节点设置为当前节点的下一个节点
        this.next = newNext;
    }

    //显示所有节点信息。
    public void show() {
        Node currentNode = this;
        while (currentNode != null) {
            System.out.print(currentNode.data + "  ");
            currentNode = currentNode.next;
        }
    }


    //判断当前节点是否为最后一个节点
    public boolean isLast() {
        return this.next == null;
    }

    //获取下一个节点
    public Node getNext() {
        return this.next;
    }


    //获取节点数据
    public int getData() {
        return this.data;
    }


}
