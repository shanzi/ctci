package me.exercise;

import java.util.Stack;

/**
 * Created by Chase_Zhang on 12/7/14.
 */


public class Ex2 {
    // push, pop and min for stack

    public class ExtendedStack {

        public class MinValue {
            int value;
            int times;

            public MinValue(int val) {
                value = val;
                times = 1;
            }
        }

        Stack<Integer> dataStack;
        Stack<MinValue> minStack;

        public ExtendedStack() {
            dataStack = new Stack<Integer>();
            minStack = new Stack<MinValue>();
        }

        public void push(int data) {
            dataStack.push(data);
            if (minStack.isEmpty() || minStack.peek().value > data) minStack.push(new MinValue(data));
            else minStack.peek().times ++;
        }

        public int pop() {
            int res = dataStack.pop().intValue();
            minStack.peek().times --;
            if (minStack.peek().times == 0) minStack.pop();
            return res;
        }

        public int peek() {
            if (!dataStack.isEmpty()) return dataStack.peek().intValue();
            else return 0;
        }

        public int min() {
            if (!minStack.isEmpty()) return minStack.peek().value;
            else return Integer.MIN_VALUE;
        }
    }

    public ExtendedStack createExtendedStack() {
        return new ExtendedStack();
    }
}
