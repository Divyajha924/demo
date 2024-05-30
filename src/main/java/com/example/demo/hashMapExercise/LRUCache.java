package com.example.demo.hashMapExercise;

import model.DoubleListNode;

import java.util.HashMap;

public class LRUCache {

    DoubleListNode head = new DoubleListNode(-1,-1);
    DoubleListNode tail = new DoubleListNode(-1,-1);

    HashMap<Integer, DoubleListNode> map = new HashMap<>();

    int size;

    public LRUCache(int capacity) {
        this.size = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            DoubleListNode node = map.get(key);
            removeNode(node);
            addNode(node);
            return node.val;
        } else return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            removeNode(map.get(key));
            map.remove(key);
        } else if(map.size()==size) {
            map.remove(tail.prev.key);
            removeNode(tail.prev);
        };

        DoubleListNode toAdd = new DoubleListNode(key,value);
        addNode(toAdd);
        map.put(key,toAdd);

    }


    private void addNode(DoubleListNode toAdd) {
        DoubleListNode tempNode = head.next;
        toAdd.next = head.next;
        toAdd.next.prev =toAdd;
        head.next = toAdd;
        toAdd.prev = head;
    }

    private void removeNode(DoubleListNode toRemove) {
        DoubleListNode tempNode = toRemove;

        toRemove.prev.next = toRemove.next;
        if(toRemove.next!=null)
        toRemove.next.prev = toRemove.prev;

    }


    public static void main(String[] args) {

         LRUCache obj = new LRUCache(2);

         obj.put(1,1);
         obj.put(2,2);
        System.out.println(obj.get(1));
         obj.put(3,3);
        System.out.println(obj.get(2));
         obj.put(4,4);
        System.out.println(obj.get(1));
        System.out.println(obj.get(3));
        System.out.println(obj.get(4));

        LRUCache obj2 = new LRUCache(1);
        obj2.put(2,1);
        System.out.println(obj2.get(2));
        System.gc();
    }
}
