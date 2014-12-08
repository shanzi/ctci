package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex1Test {

    @Test
    public void testInsertNumber() throws Exception {

        int M = 0b1010;
        int N = 0b10110110111101;

        int expect = 0b10110111010101;
        int i = 3;
        int j = 7;

        assertEquals(Ex1.insertNumber(M, N, i, j), expect);

    }
}