package com.tree.cn;

import java.util.Arrays;

public class TextBinaryTree {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        TreeNode rootL = new TreeNode(2);
        TreeNode rootR = new TreeNode(3);
        binaryTree.setRoot(root);
        root.setLeftNode(rootL);
        root.setRightNode(rootR);
        rootL.setLeftNode(new TreeNode(4));
        rootL.setRightNode(new TreeNode(5));
        rootR.setLeftNode(new TreeNode(6));
        rootR.setRightNode(new TreeNode(7));
        System.out.println(BinaryTree.getData(root.midSearch(7)));
        binaryTree.delete(5);


    }

}
