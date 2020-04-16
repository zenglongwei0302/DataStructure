package com.tree.cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HuffmanTree {
    public static HuffmanTreeNode createHuffmanTree(int[] arr){
        //先使用原来数组中的元素创建若干二叉树
        List<HuffmanTreeNode> huffmanTreeNodes = new ArrayList<>();

        for (int value:arr) {
            huffmanTreeNodes.add(new HuffmanTreeNode(value));
        }

        while (huffmanTreeNodes.size()>1){
            //排序
            Collections.sort(huffmanTreeNodes);

            //取出权值最小的两个二叉树
            HuffmanTreeNode leftNode = huffmanTreeNodes.get(huffmanTreeNodes.size()-1);
            HuffmanTreeNode rightNode = huffmanTreeNodes.get(huffmanTreeNodes.size()-2);

            //创建出新的二叉树
            HuffmanTreeNode parent = new HuffmanTreeNode(leftNode.value+rightNode.value);
            //把之前的取出来的两棵二叉树设置为新创建的二叉数的子树
            parent.leftNode = leftNode;
            parent.rightNode = rightNode;

            //把取出来的二叉树移除

            huffmanTreeNodes.remove(rightNode);
            huffmanTreeNodes.remove(leftNode);

            //放入原来的二叉树集合中
            huffmanTreeNodes.add(parent);
        }

        return  huffmanTreeNodes.get(0);
    }
}
