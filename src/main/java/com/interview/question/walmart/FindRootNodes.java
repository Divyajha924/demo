package com.interview.question.walmart;


import model.TreeNode;

import java.util.ArrayList;

public class FindRootNodes {

    static ArrayList<Integer> list = new ArrayList<>();

    public static ArrayList<Integer> findRootNode(int target, TreeNode root){

        // list.add(root.val);
        findRootNode(target,root,list);
     return list;
    }
    public static boolean findRootNode(int target, TreeNode root, ArrayList<Integer> list){

        if(root ==null){
            return false;
        }
        list.add(root.val);
        if(root.val == target)  {
            //list.add(root.val);
            return true;
        }

        if(findRootNode(target,root.left,list) || findRootNode(target,root.right,list)){
            return true;
        }
        list.remove(list.size()-1);
        return false;
    }

    public static void main(String[] args) {
      TreeNode node1 = new TreeNode(1);
      TreeNode node2 = new TreeNode(2);

      TreeNode node3 = new TreeNode(3);
      TreeNode node4 = new TreeNode(4);

      TreeNode node5 = new TreeNode(5);
      TreeNode node6 = new TreeNode(6);

        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);

        node1.left = node2;
        node1.right = node3;

        node3.left = node4;
        node3.right = node5;

        node2.left = node6;
        node2.right = node7;

        findRootNode(7,node1);

        System.gc();

        list.stream().forEach(System.out::println);
    }
}
