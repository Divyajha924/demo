package com.example.demo.treeExercise;

import model.TreeNode;

import java.util.Scanner;

class BinaryTreeMinDepth {
    public static int minDepth(TreeNode root) {

        if(root== null){
            return 0;
        }

        if(root.left == null){
            return 1 + minDepth(root.right);
        }

        if(root.right == null){
            return 1 + minDepth(root.left);
        }

        return 1 + Math.min(minDepth(root.right), minDepth(root.left));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //

        TreeNode node = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);

        //node.left = node2;
       // node.right = node3;

        node2.left = null;
        node2.right = node3;

        node3.left = null;
        node3.right = node4;

        node4.left = null;
        node4.right = node5;

        node5.left = null;
        node5.right = node6;

        System.out.println(minDepth(node2));
    }
}

