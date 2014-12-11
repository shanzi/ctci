package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex3Test {
    int[] makeArray(int start, int factor, int length) {
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            res[i] = start + factor * i;
        }
        return res;
    }

    void fillDuplicated(int[] array, int start, int length) {
        int value = array[start];
        for (int i = start+1; i < start+length; i++) {
            array[i] = value;
        }
    }

    int[] makeDupliated(int mid, int k, int length) {
        int [] res = new int[length];
        for (int i = 0; i < length; i++) {
            if (i < mid - k) res[i] = i + k;
            else if (i > mid + k) res[i] = i - k;
            else res[i] = mid;
        }
        return res;
    }

    @Test
    public void testFindMagicIndexWithoutDuplicated() throws Exception {
        int[] array1 = makeArray(0, 2, 100);
        int[] array2 = makeArray(-99, 2, 100);
        int[] array3 = makeArray(-50, 2, 100);

        assertEquals(0, Ex3.findMagicIndexWithoutDuplicated(array1));
        assertEquals(99, Ex3.findMagicIndexWithoutDuplicated(array2));
        assertEquals(50, Ex3.findMagicIndexWithoutDuplicated(array3));

    }

    @Test
    public void testFindMagicIndexWithDuplicated() throws Exception {
        int[] array1 = makeArray(0, 2, 100);
        int[] array2 = makeArray(-99, 2, 100);
        int[] array3 = makeArray(-50, 2, 100);

        assertEquals(0, Ex3.findMagicIndexWithDuplicated(array1));
        assertEquals(99, Ex3.findMagicIndexWithDuplicated(array2));
        assertEquals(50, Ex3.findMagicIndexWithDuplicated(array3));

        fillDuplicated(array1, 20, 40);
        assertEquals(40, Ex3.findMagicIndexWithDuplicated(array1));

        int[] array4 = makeDupliated(45, 5, 100);
        assertEquals(45, Ex3.findMagicIndexWithDuplicated(array4));
    }
}