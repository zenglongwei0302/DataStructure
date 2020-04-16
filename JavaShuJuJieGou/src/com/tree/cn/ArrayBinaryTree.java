package com.tree.cn;

/**
 * 顺序存储二叉树
 */
public class ArrayBinaryTree {
    int[] data;

    public ArrayBinaryTree(int[] data) {
        this.data = data;
    }

    public void frontShow() {
        frontShow(0);
    }

    public void midShow() {
        midShow(0);
    }

    public void afterShow() {
        afterShow(0);
    }

    //前序遍历
    public void frontShow(int index) {
        if (data == null || data.length == 0) {
            return;
        }
        //遍历当前节点
        System.out.print(data[index] + "  ");
        //处理左节点
        if (2 * index + 1 < data.length) {
            frontShow(2 * index + 1);
        }
        //处理右子树
        if (2 * index + 2 < data.length) {
            frontShow(2 * index + 2);
        }
    }

    //中序遍历
    public void midShow(int index) {

        if (data == null || data.length == 0) {
            return;
        }
        //处理左节点
        if (2 * index + 1 < data.length) {
            frontShow(2 * index + 1);
        }
        System.out.print(data[index] + "  ");

        //处理右子树
        if (2 * index + 2 < data.length) {
            frontShow(2 * index + 2);
        }
    }

    //后序遍历
    public void afterShow(int index) {

        if (data == null || data.length == 0) {
            return;
        }
        //处理左节点
        if (2 * index + 1 < data.length) {
            frontShow(2 * index + 1);
        }
        //处理右子树
        if (2 * index + 2 < data.length) {
            frontShow(2 * index + 2);
        }
        System.out.print(data[index] + "  ");


    }




}
