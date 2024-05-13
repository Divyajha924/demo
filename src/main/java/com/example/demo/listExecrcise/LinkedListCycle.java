package com.example.demo.listExecrcise;

import model.ListNode;

import java.util.HashSet;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> hs = new HashSet<>();
        ListNode n = head;
        while(n!=null){
            if(!hs.add(n)){
                return true;
            }
            n = n.next;
        }
        return false;
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
        System.out.println(hasCycle(head));
    }
}
