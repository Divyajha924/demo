package com.example.demo.listExecrcise;

import model.ListNode;
import model.TreeNode;

import java.util.Scanner;

public class MergeSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode l3 = new ListNode();
        ListNode l3haed = l3;

        while(true){
            if(l1 == null && l2 != null){
                l3.next = l2;
                break;
            }
            if(l2 == null && l1 != null){
                l3.next = l1;
                break;
            }
            if(l1.val>= l2.val)
            {
                l3.next = l2;
                l2 = l2.next;
            }
            if(l1.val <= l2.val)
            {
                l3.next = l1;
                l1 = l1.next;
            }
            l3 =l3.next;

        }

        return l3haed.next;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //

        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);

        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);

        node.next = node2;

    }
}
