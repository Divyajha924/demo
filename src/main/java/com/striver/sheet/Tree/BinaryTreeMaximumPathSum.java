package com.striver.sheet.Tree;

import model.TreeNode;

public class BinaryTreeMaximumPathSum {
    static int max =  Integer.MIN_VALUE;
    //int maxConnected = Integer.MIN_VALUE;
    public static int maxPathSum(TreeNode root) {
        getSum(root);
        return max;
    }

    public static int getSum(TreeNode root){
        if(root == null){
            return 0;
        }

        int left_sum = Math.max(0,getSum(root.left));
        int right_sum = Math.max(0, getSum(root.right));
        max = Math.max(max, left_sum+ right_sum+ root.val);
        return Math.max(left_sum , right_sum) + root.val;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(8);
        TreeNode node4 = new TreeNode(11);
        TreeNode node5 = new TreeNode(13);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(2);
        TreeNode node9 = new TreeNode(1);

        node.left = node2;
        node.right = node3;

        node2.left = node4;
        node2.right = null;

        node3.left = node5;
        node3.right = node6;

        node4.left = node7;
        node4.right = node8;
        node6.right = node9;

        System.out.println(maxPathSum(node));
    }
}
