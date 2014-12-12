package me.exercise;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class Ex4Test {

    @Test
    public void testCheckDuplicated() throws Exception {
        int[] array = new int[32000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int i = 1000; i < 2000; i++) {
            array[i+5000] = i;
        }

        HashSet<Integer> dups = Ex4.checkDuplicated(array);
        assertEquals(1000, dups.size());
    }
}