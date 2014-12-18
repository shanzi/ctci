package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex8Test {

    @Test
    public void testMaxSumSubSeq() throws Exception {
        int[] neg = {-1, -2, -4, -3, -2, -1, -5, -6};
        Ex8.Result resNeg = Ex8.maxSumSubSeq(neg);

        assertEquals(0, resNeg.start);
        assertEquals(0, resNeg.end);
        assertEquals(0, resNeg.sum);

        int[] pos = {1, 2, 3, 2, 5, 1, 7, 1, 1, 5};
        Ex8.Result resPos = Ex8.maxSumSubSeq(pos);
        assertEquals(0, resPos.start);
        assertEquals(pos.length-1, resPos.end);
        assertEquals(28, resPos.sum);


        int[] mix1 = {1, 2, 3, -2, -5, -1, 7, 1, 1, 5};
        Ex8.Result resMix1 = Ex8.maxSumSubSeq(mix1);
        assertEquals(6, resMix1.start);
        assertEquals(mix1.length-1, resMix1.end);
        assertEquals(14, resMix1.sum);

        int[] mix2 = {2, -8, 3, -2, 4, -10};
        Ex8.Result resMix2 = Ex8.maxSumSubSeq(mix2);
        assertEquals(2, resMix2.start);
        assertEquals(4, resMix2.end);
        assertEquals(5, resMix2.sum);
    }
}