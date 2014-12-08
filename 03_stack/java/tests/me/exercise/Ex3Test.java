package me.exercise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex3Test {

    private Ex3 ex3Solutions;

    @Before
    public void setUp() throws Exception {
        ex3Solutions = new Ex3();
    }

    @Test
    public void testCreateSetOfStacks() throws Exception {
        Ex3.SetOfStacks stack = ex3Solutions.createSetOfStacks();
        for (int i = 0; i < 100; i++) {
            stack.push(i);
            assertEquals(stack.peek(), i);
        }

        for (int i = 99; i >=0; i--) {
            assertEquals(stack.pop(), i);
        }
    }
}