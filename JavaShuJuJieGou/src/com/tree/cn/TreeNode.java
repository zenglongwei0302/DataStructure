package com.tree.cn;

import java.lang.annotation.Target;

public class TreeNode {
    //节点的数据
    int value;
    //左儿子
    TreeNode leftNode;
    //右儿子
    TreeNode rightNode;

    //用于标识左子树类型
    byte leftType;
    //用于标识右子树类型
    byte rightType;

    public TreeNode(int value){
        this.value = value;
    }

    //设置左儿子
    public void setLeftNode(TreeNode leftNode){
        this.leftNode = leftNode;
    }

    //设置右儿子
    public void setRightNode(TreeNode rightNode){
        this.rightNode = rightNode;
    }

    //先序遍历
    public void frontShow() {
        System.out.print(value+"  ");
        if (leftNode!=null){
            leftNode.frontShow();
        }
        if (rightNode!=null){
            rightNode.frontShow();
        }
    }

    //中序遍历
    public void midShow() {
        
        if (leftNode!=null){
            leftNode.midShow();
        }
        System.out.print(value);
        
        if (rightNode!=null){
            rightNode.midShow();
        }
    }

    //后序遍历
    public void afterShow() {
        if (leftNode!=null){
            leftNode.afterShow();
        }
        if (rightNode!=null){
            rightNode.afterShow();
        }
        System.out.print(value+"  ");

    }

    //前序查找
    public TreeNode frontSearch(int i) {
        TreeNode target = null;
        //查找当前节点是否为需要查找的值
        if (value==i){
            return this;
        }

        if (leftNode!=null){
            target.frontSearch(i);
        }
        if (target!=null){
            return target;
        }
        if (rightNode!=null){
            target = rightNode.frontSearch(i);
        }
        return target;
    }

    //中序查找
    public TreeNode midSearch(int i) {
        TreeNode target = null;
        if(leftNode != null) {
            target = leftNode.midSearch(i);
        }
        if(target != null) {
            return target;
        }
        if(value==i) {
            return this;
        }
        if(rightNode != null) {
            target = rightNode.midSearch(i);
        }
        return target;
    }

    //后序查找
    public TreeNode afterSearch(int i) {
        TreeNode target = null;
        if (leftNode!=null){
            target = leftNode.afterSearch(i);
        }
        if (target!=null){
            return target;
        }
        if (rightNode!=null){
            target = rightNode.afterSearch(i);
        }
        if (target!=null){
            return target;
        }
        if(value==i){
            return this;
        }
        return target;
    }


    //获取当前对象的数据
    public int getData() {
        return this.value;
    }

    //删除一颗子树
    public void delete(int i) {
        TreeNode parent = this;
        if (parent.leftNode!=null&&parent.leftNode.value == i) {
            parent.leftNode = null;
            return;
        }
        if (parent.rightNode!=null&&parent.rightNode.value == i) {
            parent.rightNode = null;
            return;
        }

        //递归检查并删除左儿子
        parent = leftNode;
        if (parent!=null){
            parent.delete(i);
        }
        //递归检查并删除右儿子
        parent = rightNode;
        if (parent!=null){
            parent.delete(i);
        }
    }


}
