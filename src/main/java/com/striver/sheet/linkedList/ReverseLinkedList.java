package com.striver.sheet.linkedList;

import model.ListNode;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode next , curr =head ,prev=null;
        while(curr!=null){
            next = curr.next;
            curr.next =prev;
            prev = curr;
            curr = next;
        }
        return prev;
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

        ///////////////////// Middle Node ///////////////

        ListNode middle =  MiddleOfTheLinkedList.middleNode(head);
        System.out.println(middle.val);

        ///////////////////////////////////////////////////


       ListNode reshead =  reverseList(head);
        ListNode curr = reshead;
        while(curr!=null){
            System.out.print(curr.val);
            curr = curr.next;
        }
    }

}
