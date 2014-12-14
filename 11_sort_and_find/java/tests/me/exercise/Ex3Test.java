package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex3Test {

    int[] makeRotatedArray(int len, int rotatedCount) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            if (i < rotatedCount) {
                array[i] = i + rotatedCount;
            } else {
                array[i] = i - rotatedCount;
            }
        }
        return array;
    }

    int[] makeDuplicatedArray(int len, boolean isLeft) {
        int[] array = new int[len];
        int mid = len/2;
        array[0] = mid;
        array[mid] = mid;
        array[len-1] = mid;
        if (isLeft) {
            for (int i = 1; i < mid; i++) {
                array[i] = i - 1;
            }
            for (int i = mid+1; i < len-1; i++) {
                array[i] = mid;
            }
        } else {
            for (int i = mid+1; i < len-1; i++) {
                array[i] = i - mid - 1;
            }
            for (int i = 1; i < mid-1; i++) {
                array[i] = mid;
            }
        }
        return array;
    }

    @Test
    public void testSearch() throws Exception {
        int[] rotate0 = makeRotatedArray(100, 0);
        int[] rotate31 = makeRotatedArray(100, 31);
        int[] dupLeft = makeDuplicatedArray(100, true);
        int[] dupRight = makeDuplicatedArray(100, false);

        assertEquals(-1, Ex3.search(rotate0, 101));
        assertEquals(-1, Ex3.search(rotate31, 101));
        assertEquals(-1, Ex3.search(dupLeft, 101));
        assertEquals(-1, Ex3.search(dupRight, 101));

        for (int i = 10; i < 40; i++) {
            int a = Ex3.search(rotate0, i);
            int b = Ex3.search(rotate31, i);
            int c = Ex3.search(dupLeft, i);
            int d = Ex3.search(dupRight, i);

            assertTrue(a > 0);
            assertTrue(b > 0);
            assertTrue(c > 0);
            assertTrue(d > 0);

            assertEquals(i, rotate0[a]);
            assertEquals(i, rotate31[b]);
            assertEquals(i, dupLeft[c]);
            assertEquals(i, dupRight[d]);
        }
    }
}