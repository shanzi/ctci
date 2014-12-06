package me.exercise;

/**
 * Created by Chase_Zhang on 12/6/14.
 */
public class Ex4 {
    // split list by x

    public void splitList(LinkedList list, int x) {
        LinkedListNode head1 = null;
        LinkedListNode tail1 = null;
        LinkedListNode head2 = null;
        LinkedListNode tail2 = null;

        LinkedListNode cur = list.head;
        while (cur != null) {
            if (cur.data < x) {
                if (head1 == null) {
                    head1 = cur;
                    tail1 = cur;
                } else {
                    tail1.next = cur;
                    tail1 = cur;
                }
            } else {
                if (head2 == null) {
                    head2 = cur;
                    tail2 = cur;
                } else {
                    tail2.next = cur;
                    tail2 = cur;
                }
            }
            cur = cur.next;
        }

        tail1.next = head2;
        list.head = head1;
        tail2.next = null;
    }
}
