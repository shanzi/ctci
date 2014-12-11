package me.exercise;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.*;

public class Ex5Test {

    @Test
    public void testAllCombinationsOfStringNonDuplicated() throws Exception {
        String str = "abcdefg";
        ArrayList<String> combinations = Ex5.allCombinationsOfStringNonDuplicated(str);
        HashSet<String> set = new HashSet<String>();

        for (String comb : combinations) {
            set.add(comb);
        }

        assertEquals(5040, set.size());

    }
}