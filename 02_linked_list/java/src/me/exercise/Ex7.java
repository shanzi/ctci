package me.exercise;

import java.util.Stack;

/**
 * Created by Chase_Zhang on 12/6/14.
 */
public class Ex7 {
    // check if a linked list is palindrome

    public boolean checkPalindromeByIteration(LinkedList list) {
        LinkedListNode fastRunner = list.head;
        LinkedListNode slowRunner = list.head;
        Stack<Integer> stack = new Stack<Integer>();
        while (fastRunner != null && fastRunner.next != null) {
            stack.push(slowRunner.data);
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;
        }

        if (fastRunner != null) slowRunner = slowRunner.next;

        while (slowRunner != null) {
            if (stack.isEmpty()) return false;

            int top = stack.pop().intValue();

            if (top != slowRunner.data) return false;
            slowRunner = slowRunner.next;
        }

        return true;
    }
}
