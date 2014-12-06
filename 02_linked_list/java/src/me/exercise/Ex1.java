package me.exercise;


import java.util.HashSet;

/**
 * Created by Chase_Zhang on 12/6/14.
 */
public class Ex1 {
    // remove duplicated nodes in a linked list

    public void removeDuplicatedNodesWithBuffer(LinkedList list) {
        HashSet set = new HashSet();
        LinkedListNode previous = null;
        LinkedListNode current = list.head;
        while (current != null) {
            if (set.contains(current.data)) {
                previous.next = current.next;
                current = current.next;
            } else {
                set.add(current.data);
                previous = current;
                current = current.next;
            }
        }
    }

    public void removeDuplicatedNodesWithoutBuffer(LinkedList list) {
        LinkedListNode current = list.head;
        while (current != null) {
            LinkedListNode checkPrevious = current;
            LinkedListNode checkCur = current.next;
            while (checkCur != null) {
                if (checkCur.data == current.data) {
                    checkPrevious.next = checkCur.next;
                }
                checkCur = checkCur.next;
            }
            current = current.next;
        }
    }
}
