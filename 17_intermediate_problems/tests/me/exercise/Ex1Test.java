package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex1Test {

    @Test
    public void testSwap() throws Exception {
        int a = 1;
        int b = 100;
        Ex1.Result res = Ex1.swap(a, b);
        assertEquals(b, res.a);
        assertEquals(a, res.b);
    }

    @Test
    public void testSwapXOR() throws Exception {
        int a = 1;
        int b = 100;
        Ex1.Result res = Ex1.swapXOR(a, b);
        assertEquals(b, res.a);
        assertEquals(a, res.b);
    }
}