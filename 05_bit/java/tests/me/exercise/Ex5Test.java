package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex5Test {

    @Test
    public void testCountOfDifferentBits() throws Exception {

        int a = 0b0001001;
        int b = 0;
        assertEquals(2, Ex5.countOfDifferentBits(a, b));

        int c = 0b0010010011;
        int d = 0b0101001011;
        assertEquals(5, Ex5.countOfDifferentBits(c, d));

        int e = 0b110111011011;
        int f = 0b110111011011;
        assertEquals(0, Ex5.countOfDifferentBits(e, f));

    }
}