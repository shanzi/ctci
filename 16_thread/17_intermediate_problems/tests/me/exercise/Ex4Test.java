package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex4Test {

    @Test
    public void testMax() throws Exception {
        assertEquals(5, Ex4.max(3, 5));
        assertEquals(7, Ex4.max(7, 5));
    }
}