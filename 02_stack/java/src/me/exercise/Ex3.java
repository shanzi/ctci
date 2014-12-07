package me.exercise;

import java.util.Stack;

/**
 * Created by Chase_Zhang on 12/7/14.
 */
public class Ex3 {
    // set of stack
    public class SetOfStacks {
        Stack<Stack<Integer>> stackOfStacks;
        int limit;

        public SetOfStacks(int limit) {
            this.limit = limit;
            stackOfStacks = new Stack<Stack<Integer>>();
        }

        public Stack<Integer> peekStack() {
            if (stackOfStacks.isEmpty()) {
                stackOfStacks.push(new Stack<Integer>());
            } else if (stackOfStacks.peek().size() >= limit) {
                stackOfStacks.push(new Stack<Integer>());
            }
            return stackOfStacks.peek();
        }

        public void push(int data) {
            peekStack().push(data);
        }

        public int pop() {
            Stack<Integer> peekSt = stackOfStacks.peek();
            int res = peekSt.pop().intValue();
            if (peekSt.isEmpty()) stackOfStacks.pop();
            return res;
        }

        public int peek() {
            if (stackOfStacks.isEmpty()) return -1;
            return stackOfStacks.peek().peek().intValue();
        }
    }

    public SetOfStacks createSetOfStacks() {
        return new SetOfStacks(10);
    }
}
