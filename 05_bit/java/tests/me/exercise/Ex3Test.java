package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex3Test {

    @Test
    public void testGetNext() throws Exception {
        int a = ~0b1111111;
        assertEquals(-1, Ex3.getNext(a));

        int b = 0b10111011011111000;
        int bNext = 0b10111011100001111;
        assertEquals(bNext, Ex3.getNext(b));

        int c = 0b10111011110111111111;
        int cNext = 0b10111011111011111111;
        assertEquals(cNext, Ex3.getNext(c));
    }

    @Test
    public void testGetPrev() throws Exception {
        int a = 0b11111111111;
        assertEquals(-1, Ex3.getPrev(a));

        int b = 0b10111011011111000;
        int bNext = 0b10111011011110100;
        assertEquals(bNext, Ex3.getPrev(b));

        int c = 0b10111011110111111111;
        int cNext = 0b10111011101111111111;
        assertEquals(cNext, Ex3.getPrev(c));
    }
}