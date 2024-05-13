package com.example.demo.treeExercise;

import model.TreeNode;

import java.util.Scanner;

/*https://leetcode.com/problems/maximum-depth-of-binary-tree/description/*/

class BinaryTreeDepth {
    public static int maxDepth(TreeNode root) {
        int depth =0;

       while(root != null) {
           int l = maxDepth(root.left);
           int r = maxDepth(root.right);
           depth = Math.max(l, r) + 1;
           return depth;
       }

        return depth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //

        TreeNode node = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);

        node.left = node2;
        node.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        node4.left = node8;
        node4.right = node9;

        System.out.println(maxDepth(node));
    }
}

