package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex12Test {

    int[] makeNumbers(int sum, int count) {
        if (count == 0) {
            int[] array = new int[100];
            for (int i = 0; i < 50; i++) {
                array[i] = sum + 1;
            }
            for (int i = 50; i < 100; i++) {
                array[i] = sum - 1;
            }
            return array;
        } else {
            int[] array = new int[count * 4];
            for (int i = 0; i < count; i++) {
                array[i] = i;
                array[i + count] = sum - i;
            }
            for (int i = count * 2; i < array.length; i++) {
                array[i] = sum + i + count;
            }
            return array;
        }
    }


    @Test
    public void testPairsSumsTo() throws Exception {
        int[] nores = makeNumbers(100, 0);
        assertEquals(0, Ex12.pairsSumsTo(nores, 100).size());

        int[] array = makeNumbers(50, 50);
        assertEquals(50, Ex12.pairsSumsTo(array,50).size());
    }
}