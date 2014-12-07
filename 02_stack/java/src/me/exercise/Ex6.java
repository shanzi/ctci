package me.exercise;

import java.util.Stack;

/**
 * Created by Chase_Zhang on 12/7/14.
 */
public class Ex6 {
    // sorted stack

    public void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) return;

        Stack<Integer> buff = new Stack<Integer>();
        buff.push(stack.pop());

        while (!stack.isEmpty()) {
            int tmp = stack.pop().intValue();

            while (!buff.isEmpty() && tmp > buff.peek()) {
                stack.push(buff.pop());
            }

            buff.push(tmp);
        }

        while (!buff.isEmpty()) {
            stack.push(buff.pop());
        }
    }
}
