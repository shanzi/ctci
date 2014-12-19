package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex4Test {

    @Test
    public void testCount2() throws Exception {
        assertEquals(1, Ex4.count2(2));
        assertEquals(1, Ex4.count2(9));
        assertEquals(2, Ex4.count2(12));
        assertEquals(2, Ex4.count2(13));
        assertEquals(9, Ex4.count2(25));
        assertEquals(20, Ex4.count2(100));
        assertEquals(21, Ex4.count2(102));

        for (int i = 5000; i < 10000; i++) {
            assertEquals(Ex4.count2(i), Ex4.count2sInRange(i));
        }
    }

    @Test
    public void testCount2sInRange() throws Exception {
        assertEquals(1, Ex4.count2sInRange(2));
        assertEquals(1, Ex4.count2sInRange(9));
        assertEquals(2, Ex4.count2sInRange(12));
        assertEquals(2, Ex4.count2sInRange(13));
        assertEquals(9, Ex4.count2sInRange(25));
        assertEquals(20, Ex4.count2sInRange(100));
        assertEquals(21, Ex4.count2sInRange(102));
    }
}