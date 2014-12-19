package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex6Test {

    int[] makeRandomArray() {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i;
        }

        Ex2.suffleArray(array);
        return array;
    }

    @Test
    public void testRank() throws Exception {
        int[] array = makeRandomArray();
        Ex2.suffleArray(array);
        for (int i = 0; i < 20; i++) {
            assertEquals(i, Ex6.rank(array, i));
        }
    }
}