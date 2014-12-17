package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex6Test {

    @Test
    public void testFindRange() throws Exception {

        int[] test = {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};
        Ex6.Range range = Ex6.findRange(test);
        assertEquals(3, range.start);
        assertEquals(9, range.end);
    }
}