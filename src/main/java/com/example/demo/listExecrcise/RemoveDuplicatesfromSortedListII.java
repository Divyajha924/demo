package com.example.demo.listExecrcise;

import model.ListNode;

public class RemoveDuplicatesfromSortedListII {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        ListNode dummy = new ListNode();
        dummy.next = head;
        boolean insertedflag = false;
        ListNode toReturn = dummy;
        ListNode toReturnHead = toReturn;
        ListNode prev = null;
        while(curr!=null){
            if(curr.next!= null && curr.val!= curr.next.val){
                if(prev == null || prev.val != curr.val){
                    toReturn.next = new ListNode(curr.val);
                    toReturn = toReturn.next;
                    insertedflag = true;
                }
            }
            if(curr.next == null){
                if(prev == null || prev.val != curr.val){
                    toReturn.next = new ListNode(curr.val);
                    toReturn = toReturn.next;
                    insertedflag = true;
                }
            }
            prev = curr;
            curr= curr.next;
        }
        return insertedflag ? toReturnHead.next : null;
    }
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);

        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(2);

        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(6);

        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);


        ListNode head = node;
        node.next = node2;
        node2.next = node3;
        node3.next = null;
        node4.next = node5;
        node5.next = null;


        System.out.println(deleteDuplicates(head));
    }
}
