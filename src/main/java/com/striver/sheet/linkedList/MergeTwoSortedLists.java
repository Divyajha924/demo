package com.striver.sheet.linkedList;

import model.ListNode;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode temp = new ListNode(-1);
        ListNode result = temp;
        while(list1!=null && list2!=null){
            if(list1.val>list2.val){
                temp.next= list2;
                temp =temp.next;
                list2= list2.next;
            } else{
                temp.next= list1;
                temp =temp.next;
                list1 = list1.next;
            }
        }

        while (list1 != null) {
            temp.next = list1;
            temp =temp.next;
            list1= list1.next;
        }

        while (list2 != null) {
            temp.next = list2;
            temp =temp.next;
            list2= list2.next;
        }

        return result.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);

        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(7);

        ListNode node5 = new ListNode(8);
        ListNode node6 = new ListNode(9);

        ListNode node7 = new ListNode(3);
        ListNode node8 = new ListNode(5);

        ListNode node9 = new ListNode(7);
        ListNode node10 = new ListNode(8);




        ListNode head = node;
        node.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        ListNode head2 = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;

        ListNode result3 = mergeTwoLists(head,head2);

        while(result3!=null){
            System.out.print(result3.val);
            result3 = result3.next;
        }
    }
}
