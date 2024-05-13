package com.example.demo.treeExercise;

import model.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryTreeInorderTraversal {
    static List<Integer> list = new ArrayList<>();
    public static List<Integer> inorderTraversal(TreeNode root) {
      //
        if(root==null){
            return null;
        }
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);

      return list;
    }
    static void printInorder(TreeNode node)
    {
        if(node == null)
        {
            return;
        }
        printInorder(node.left);
        System.out.print(node.val + " ");
        printInorder(node.right);
    }

    public static void main(String[] args) {
       // int[]  preorder = {9,15,7,20,3};
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

        List<Integer> list = inorderTraversal(node);

       for(int i =0 ; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
