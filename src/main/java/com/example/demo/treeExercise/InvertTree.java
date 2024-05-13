package com.example.demo.treeExercise;

import model.TreeNode;

import java.util.Scanner;
/*https://leetcode.com/problems/invert-binary-tree/description/*/
class InvertTree {
    public static TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }

        root.left= invertTree(root.left);
        root.right = invertTree(root.right);

        TreeNode temp;
        temp = root.right;
        root.right = root.left;
        root.left = temp;
        return root;
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

        /*node.setLeft(node2);
        node.setRight(node3);

        node2.setLeft(node4);
        node2.setRight(node5);

        node3.setLeft(node6);
        node3.setRight(node7);

        node4.setLeft(node8);
        node4.setRight(node9);*/

        System.out.println(invertTree(node));
    }
}

