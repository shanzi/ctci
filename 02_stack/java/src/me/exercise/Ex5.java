package me.exercise;

import java.util.Stack;

/**
 * Created by Chase_Zhang on 12/7/14.
 */
public class Ex5 {
    // queue with two stack

    public class StackQueue {
        Stack<Integer> inStack;
        Stack<Integer> outStack;

        public StackQueue() {
            inStack = new Stack<Integer>();
            outStack = new Stack<Integer>();
        }

        public void enqueue(int data) {
            inStack.push(data);
        }

        public int dequeue() {
            if (outStack.isEmpty()) {
                if (inStack.isEmpty()) return -1;

                while (!inStack.isEmpty()) {
                    outStack.push(inStack.pop());
                }
            }

            return outStack.pop().intValue();
        }
    }

    public StackQueue createStackQueue() {
        return new StackQueue();
    }
}
