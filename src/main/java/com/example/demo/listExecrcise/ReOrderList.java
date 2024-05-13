package com.example.demo.listExecrcise;

import model.ListNode;

public class ReOrderList {

    public static void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode next = null;

        while(slow!=null)
        {

            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;


        }

        ListNode firsthf = head;
        ListNode secondhf = prev;

        while(secondhf.next!=null)
        {

            next = firsthf.next;
            prev = secondhf.next;

            firsthf.next = secondhf;
            secondhf.next=next;

            firsthf = next;
            secondhf = prev;
        }

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
       // node5.next = node6;

      reorderList(head);

      while(head!=null){
         System.out.println(head.val);
         head = head.next;
      }

    }

}
