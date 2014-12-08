package me.exercise;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Ex7Test {

    @Test
    public void testFindMissing() throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        int n = 1685791;
        for (int i = 0; i <= n ; i++) {
            list.add(i);
        }

        int missing = list.remove(68194).intValue();

        assertEquals(missing, Ex7.findMissing(list, n));

    }
}