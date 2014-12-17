package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex5Test {

    @Test
    public void testCountBingo() throws Exception {
        int[] test1 = {Ex5.R, Ex5.G, Ex5.B, Ex5.Y};
        int[] guess1 = {Ex5.G, Ex5.G, Ex5.R, Ex5.R};

        Ex5.Result res1 = Ex5.countBingo(test1, guess1);
        assertEquals(1, res1.bingo);
        assertEquals(1, res1.fakeBingo);

        int[] test2 = {Ex5.R, Ex5.G, Ex5.B, Ex5.Y};
        int[] guess2 = {Ex5.R, Ex5.G, Ex5.B, Ex5.Y};

        Ex5.Result res2 = Ex5.countBingo(test2, guess2);
        assertEquals(4, res2.bingo);
        assertEquals(0, res2.fakeBingo);

        int[] test3 = {Ex5.R, Ex5.G, Ex5.B, Ex5.Y};
        int[] guess3 = {Ex5.G, Ex5.B, Ex5.Y, Ex5.R};

        Ex5.Result res3 = Ex5.countBingo(test3, guess3);
        assertEquals(0, res3.bingo);
        assertEquals(4, res3.fakeBingo);


        int[] test4 = {Ex5.R, Ex5.G, Ex5.B, Ex5.Y};
        int[] guess4 = {Ex5.G, Ex5.B, Ex5.Y, Ex5.Y};

        Ex5.Result res4 = Ex5.countBingo(test4, guess4);
        assertEquals(1, res4.bingo);
        assertEquals(2, res4.fakeBingo);
    }
}