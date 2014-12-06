package me.exercise;

/**
 * Created by Chase_Zhang on 12/6/14.
 */
public class Ex5 {
    // add two numbers in list representation

    public LinkedList addReversedList(LinkedList a, LinkedList b) {
        LinkedListNode p1 = a.head;
        LinkedListNode p2 = b.head;

        LinkedList res = new LinkedList();
        LinkedListNode head = new LinkedListNode(-1);
        LinkedListNode tail = head;

        int residue = 0;
        while (true) {
            if (p1 == null && p2 == null) {
                if (residue > 0) {
                    tail.next = new LinkedListNode(residue);
                }
                break;
            }
            if (p1 != null && p2 != null) {
                int added = p1.data + p2.data + residue;
                tail.next = new LinkedListNode(added % 10);
                tail = tail.next;
                residue = added / 10;
                p1 = p1.next;
                p2 = p2.next;
            }
            else if (p1 == null) {
                int added = p2.data + residue;
                tail.next = new LinkedListNode(added % 10);
                tail = tail.next;
                residue = added / 10;
                p2 = p2.next;
            }
            else if (p2 == null) {
                int added = p1.data + residue;
                tail.next = new LinkedListNode(added % 10);
                tail = tail.next;
                residue = added / 10;
                p1 = p1.next;
            }
        }

        res.head = head.next;
        return res;
    }

    private int addSubList(LinkedListNode na, LinkedListNode nb, LinkedList res) {
        if (na == null || nb == null) return 0;
        else {
            int residue = addSubList(na.next, nb.next, res);
            int sum = na.data + nb.data + residue;
            res.prepend(sum % 10);
            return sum / 10;
        }
    }

    public LinkedList addList(LinkedList a, LinkedList b) {
        int len_a = a.length();
        int len_b = b.length();

        if (len_a > len_b) {
            for (int i = 0; i < len_a - len_b; i++) {
                b.prepend(0);
            }
        } else if (len_a < len_b) {
            for (int i = 0; i < len_b - len_a; i++) {
                a.prepend(0);
            }
        }
        LinkedList res = new LinkedList();
        int residue = addSubList(a.head, b.head, res);
        if (residue > 0) res.prepend(residue);
        return res;
    }
}
