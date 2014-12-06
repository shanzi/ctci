package me.exercise;

/**
 * Created by Chase_Zhang on 12/6/14.
 */
public class Ex2 {
    // find last k element
    public LinkedListNode findLastElement(LinkedList list, int k) {
        LinkedListNode forward = list.head;
        LinkedListNode behind = list.head;

        for (int i = 1; i < k; i++) {
            if (forward != null) {
                forward = forward.next;
            } else {
                return null;
            }
        }

        if (forward == null) return null;

        while (forward.next != null) {
            forward = forward.next;
            behind = behind.next;
        }

        return behind;
    }
}
