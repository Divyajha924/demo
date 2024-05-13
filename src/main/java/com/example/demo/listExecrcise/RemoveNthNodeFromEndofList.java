package com.example.demo.listExecrcise;

import model.ListNode;

import java.util.HashMap;

public class RemoveNthNodeFromEndofList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        HashMap<Integer,ListNode> hm = new HashMap<>();
        int i=1;
        while(curr!=null){
            hm.put(i,curr);
            i++;
            curr = curr.next;
        }
        int toRemove = i - n ;
        if(i==2&& toRemove ==1)
            head = null;
         else if(toRemove ==1){
        head = hm.get(toRemove+1)==null ? null: hm.get(toRemove+1);}
        else {
            hm.get(toRemove - 1).next = hm.get(toRemove + 1) == null ? null : hm.get(toRemove + 1);
        }
        return head;
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
        node2.next = null;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;


        System.out.println(removeNthFromEnd(head,2));
    }

}
