package me.exercise;

import java.util.ArrayList;

/**
 * Created by Chase_Zhang on 12/6/14.
 */

public class LinkedList {
    LinkedListNode head = null;

    public LinkedListNode createNode(int data) {
        LinkedListNode n = new LinkedListNode(data);
        return n;
    }

    public void append(int data) {
       if (head == null) {
           this.head = createNode(data);
       } else {
           LinkedListNode current = this.head;
           while (current.next != null) current = current.next;
           current.next = createNode(data);
       }
    }

    public void prepend(int data) {
        if (head == null) {
            this.head = createNode(data);
        } else {
            LinkedListNode node = createNode(data);
            node.next = head;
            this.head = node;
        }
    }

    public LinkedListNode tail() {
        LinkedListNode current = this.head;
        if (current == null) return null;
        while (current.next != null) current = current.next;
        return current;
    }

    public int length() {
        LinkedListNode cur = head;
        int len = 0;
        while (cur != null) {
            len ++;
            cur = cur.next;
        }
        return len;
    }

    public int[] toArray() {
        int[] array = new int[length()];
        int index = 0;
        LinkedListNode cur = head;
        while (cur != null) {
            array[index] = cur.data;
            index ++;
            cur = cur.next;
        }
        return array;
    }

    public static LinkedList fromArray(int[] array) {
        LinkedList list = new LinkedList();
        for (int i = array.length - 1; i >= 0; i--) {
            list.prepend(array[i]);
        }
        return list;
    }
}
