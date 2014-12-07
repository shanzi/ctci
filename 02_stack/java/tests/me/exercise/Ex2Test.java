package me.exercise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex2Test {

    private Ex2 ex2Solution;

    private int[] dataValues = {4, 3, 1, 5, 7, 0, 1, 2, 6, 7, -1, -2, 0, 1, 2, 3};
    private int[] minValues = {4, 3, 1, 1, 1, 0, 0, 0, 0, 0, -1, -2, -2, -2, -2, -2};

    @Before
    public void setUp() throws Exception {
        ex2Solution = new Ex2();
    }

    @Test
    public void testCreateExtendedStack() throws Exception {
        Ex2.ExtendedStack stack = ex2Solution.createExtendedStack();

        for (int i = 0; i < dataValues.length; i++) {
            stack.push(dataValues[i]);

            assertEquals(dataValues[i], stack.peek());
            assertEquals(minValues[i], stack.min());
        }

        for (int i = dataValues.length - 2; i>=0; i--) {
            assertEquals(stack.pop(), dataValues[i + 1]);
            assertEquals(stack.min(), minValues[i]);
        }
    }
}