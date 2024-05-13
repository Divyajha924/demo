package com.striver.sheet.Tree;

import model.TreeNode;

public class BalancedBinaryTree {
    boolean check = true;
    public boolean isBalanced(TreeNode root) {
        if(root ==null) return true;

      /*int leftHeight = getHeight(root.left);
      System.out.println(leftHeight);
      int rightHeight = getHeight(root.right);
      System.out.println(rightHeight);
      int difference = leftHeight-rightHeight; */
        getHeight(root);
        return check;
      /*if((Math.abs(difference) == 1 || difference ==0)) return true;
       return false; */
    }

    public int getHeight(TreeNode root){

        if(root == null) return 0;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        int depth = Integer.max(left,right)+1;

        if(Math.abs(left-right)>1)
            check =false;
        return depth;

    }
}
