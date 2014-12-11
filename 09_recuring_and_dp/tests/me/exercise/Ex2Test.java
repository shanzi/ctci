package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex2Test {

    public int recurringNumber(int X, int Y) {
        if (X <= 0 || Y <= 0) return 1;
        return recurringNumber(X-1, Y) + recurringNumber(X, Y-1);
    }

    @Test
    public void testNumberOfWays() throws Exception {
        assertEquals(2, Ex2.numberOfWays(1, 1));
        assertEquals(3, Ex2.numberOfWays(1, 2));
        assertEquals(6, Ex2.numberOfWays(2, 2));
        assertEquals(recurringNumber(4, 4), Ex2.numberOfWays(4, 4));
        assertEquals(recurringNumber(8, 9), Ex2.numberOfWays(8, 9));
    }
}