package me.exercise;

import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class Ex6Test {

    private Ex6 ex6Solution;

    private int[] array = {1, 7, 3, 5, 8, 9, 0, 2, 4, 6};
    @Before
    public void setUp() throws Exception {
        ex6Solution = new Ex6();
    }

    @Test
    public void testSortStack() throws Exception {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < 10; i++) {
            stack.push(array[i]);
        }

        ex6Solution.sortStack(stack);

        for (int i = 9; i >= 0 ; i--) {
            assertEquals(stack.pop().intValue(), i);
        }
    }
}