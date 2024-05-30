package com.example.demo.treeExercise;

import model.TreeNode;

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class ZigzagLevelOrder {

    Queue<TreeNode> queue = new LinkedList<>();
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null)return list;
        queue.offer(root);

        while (!queue.isEmpty()) {

            List<Integer> newlist = new ArrayList<Integer>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                newlist.add(node.val);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            list.add(newlist);
        }

        for(int i =0;i< list.size();i++){
            if(i%2!=0){
                Collections.reverse(list.get(i));
            }
        }

        return list;
    }

}