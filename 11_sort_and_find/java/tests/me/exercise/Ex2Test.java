package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex2Test {

    int testResult(String[] strings) {
        String c = Ex2.sorted(strings[0]);
        int count = 0;
        for (int i = 1; i < strings.length; i++) {
            String sorted = Ex2.sorted(strings[i]);
            if (!c.equals(sorted)) {
                count++;
                c = sorted;
            }
        }
        return count;
    }

    @Test
    public void testSortByComparator() throws Exception {
        String[] strings = {
                "dfgecab",
                "abcdefg",
                "abdefg",
                "dfgeca",
                "bdefga",
                "dfgeab",
                "bcdefga",
                "cdefga",
                "acdefg",
        };
        Ex2.sortByComparator(strings);
        assertEquals(2, testResult(strings));
    }

    @Test
    public void testSortByHashMap() throws Exception {
        String[] strings = {
                "dfgecab",
                "abcdefg",
                "abdefg",
                "dfgeca",
                "bdefga",
                "dfgeab",
                "bcdefga",
                "cdefga",
                "acdefg",
        };
        Ex2.sortByHashMap(strings);
        assertEquals(2, testResult(strings));
    }
}