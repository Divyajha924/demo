package com.striver.sheet.linkedList;

import model.ListNode;

public class MiddleOfTheLinkedList {
    public static ListNode middleNode(ListNode head) {

        ListNode slow = head, fast = head;
       while(fast!=null) {
           fast = fast.next.next;
           slow = slow.next;

       }
        return slow;
    }
}
