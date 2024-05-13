package com.example.demo.treeExercise;

import model.TreeNode;

import java.util.HashMap;

public class BinTreefromPostNinorder {

    static HashMap<Integer, Integer> hm = new HashMap<>();
    static int index = 0;
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        index = inorder.length - 1;
        for(int i = 0; i < inorder.length;i++){
            hm.put(inorder[i], i);
        }
        return build(postorder, inorder, 0 , inorder.length -1);
    }

    public static TreeNode build(int[] postorder, int[] inorder, int start, int end)  {
        if(start > end){
            return null;
        }

        TreeNode root = new TreeNode(postorder[index--]);
        int rootIndex = hm.get(root.val);
        root.right = build(postorder, inorder, rootIndex +1 , end);
        root.left = build(postorder, inorder, start , rootIndex -1);
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
        int[]  postorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        /*char[] postorder = {'H','I', 'D', 'J', 'E', 'B', 'K', 'F', 'G', 'C', 'A'};
        char[] inorder = {'H','D','I', 'B', 'E', 'J', 'A', 'K', 'F', 'C', 'G'};*/
        TreeNode root = buildTree(postorder,inorder);

        printInorder(root);
    }
}
