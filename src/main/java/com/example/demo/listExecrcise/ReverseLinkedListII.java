package com.example.demo.listExecrcise;

import model.ListNode;

public class ReverseLinkedListII {
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prevLeftNode = dummy;
        ListNode currNode = head;

        for(int i =0; i< left-1 ;i++){
            currNode = currNode.next;
            prevLeftNode = prevLeftNode.next;
        }

        ListNode sublisthead = currNode;
        ListNode prev = null ;
        for(int i =0; i<= right -left ; i++){
            ListNode next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode= next;
        }

        prevLeftNode.next = prev;
        sublisthead.next = currNode;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);

        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);


        ListNode head = node;
        node.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;


        System.out.println(reverseBetween(head,2,4));
    }
}
