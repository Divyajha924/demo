package com.striver.sheet.Tree;

import model.TreeNode;

public class DiameterofBinaryTree {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        return Math.max((getMaxLength(root.left) + getMaxLength(root.right)), max);
    }

    public int getMaxLength(TreeNode node) {
        if (node == null)
            return 0;
        int leftlength = getMaxLength(node.left);
        int rightlength = getMaxLength(node.right);
        int depth = Math.max(leftlength, rightlength) + 1;
        if((leftlength+rightlength)>max) max = leftlength+rightlength;
        return depth;
    }
}
