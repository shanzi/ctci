package me.exercise;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class Ex9Test {

    @Test
    public void testMedian() throws Exception {
        Ex9 ex9Solution = new Ex9();
        int[] numbers = new int[100];
        Random rand = new Random();

        assertEquals(0, ex9Solution.median(), 0.001);

        for (int i = 0; i < numbers.length; i++) {
            int c = rand.nextInt(1000);
            ex9Solution.add(c);

            numbers[i] = c;
            Arrays.sort(numbers, 0, i+1);
            double median;
            if (i % 2 == 0) median = numbers[i/2];
            else median = (numbers[i/2] + numbers[i/2 +1]) * 0.5;

            assertEquals(median, ex9Solution.median(), 0.01);
        }
    }
}