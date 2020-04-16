package com.tree.cn;

import java.util.function.Predicate;

public class BinaryTree {
    TreeNode root;
    //线索化二叉树是临时存储前驱节点；
    TreeNode pre = null;


    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    //先序遍历
    public void frontShow(){
        if(root!=null){
            root.frontShow();
        }

    }


    //中序遍历
    public void midShow(){
        if (root!=null){
            root.midShow();
        }

    }

    //后序遍历
    public void afterShow(){
        if (root!=null){
            root.afterShow();
        }
    }

    //先序查找
    public TreeNode frontSearch(int i){
        return root.frontSearch(i);
    }

    //中序查找
    public TreeNode midSearch(int i){
        return root.midSearch(i);
    }

    public TreeNode afterSearch(int i){
        return root.afterSearch(i);
    }

    public static int getData(TreeNode treeNode){
        return treeNode.getData();
    }

    //中序线索化二叉树
    public void threadNodes(){
        threadNodes(root);
    }

    public void threadNodes(TreeNode node) {
        //当前节点为null，直接返回
        if (node == null) {
            return;
        }

        //处理左子树
        threadNodes(node.leftNode);
        //处理前驱节点
        if (node.leftNode == null) {

            node.leftNode = pre;
            //改变当前节点的leftNode的类型
            node.leftType = 1;
        }
        if (pre != null && pre.rightNode == null) {
            pre.rightNode = node;
            pre.rightType = 1;
        }


        //每处理一个节点，当前节点是下一个节点的前驱节点
        pre = node;

        //处理右子树
        threadNodes(node.rightNode);

    }

    //遍历线索化二叉树

    public void threaIterate() {
        //用于存储当前遍历的节点
        TreeNode node = root;
        while (node != null) {
            //循环找到最开始的节点
            while (node.leftType == 0) {
                node = node.leftNode;
            }
            System.out.println(node.getData());

            while (node.rightType == 1) {
                node = node.rightNode;
                System.out.println(node.getData());
            }
            node = node.rightNode;
        }

    }

    //删除一颗子树
    public void delete(int i) {
        if (root.value==i){
            root = null;
        }else {
            root.delete(i);
        }
    }
}
