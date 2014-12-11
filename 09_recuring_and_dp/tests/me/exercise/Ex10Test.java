package me.exercise;


import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex10Test {
    private Ex10 ex10Solution;

    @Before
    public void setUp() throws Exception {
        ex10Solution = new Ex10();
    }

    @Test
    public void testMaxHeightStack() throws Exception {
        Ex10.Box[] boxes = ex10Solution.makeBoxes();
        ArrayList<Ex10.Box> stack = Ex10.maxHeightStack(boxes);
        assertEquals(3, stack.size());
        assertEquals(15, Ex10.stackHeight(stack));
    }
}