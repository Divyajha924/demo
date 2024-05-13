package com.example.demo.treeExercise;

import model.TreeNode;

import java.util.HashMap;

public class BinTreefromPreNinorder {
    static HashMap<Integer,Integer> hm = new HashMap<>();
    static int preIndex = 0;

    public static TreeNode buildTree(int[] preorder, int[] inorder){
        for(int i =0; i < inorder.length; i++){
            hm.put(inorder[i], i);
        }
        return build(preorder, inorder, 0, inorder.length-1);
    }

    private static TreeNode build(int[] preorder, int[] inorder, int start, int end) {
        if(start > end){
            return null;
        }

        TreeNode root = new TreeNode(preorder[preIndex++]);
        int index = hm.get(root.val);
        root.left = build(preorder,inorder,start,index-1);
        root.right = build(preorder,inorder,index+1,end);
        return root;
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
        int[]  preorder = {9,15,7,20,3};
        int[] inorder = {9,3,15,20,7};

        TreeNode root = buildTree(preorder,inorder);

        printInorder(root);
    }
}
