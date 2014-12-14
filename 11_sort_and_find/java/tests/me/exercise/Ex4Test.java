package me.exercise;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class Ex4Test {
    public String[] makeStrings() {
        String[] originStrings = {
                "afdpij",
                "bapend",
                "bacn2id",
                "obnacge",
                "he,capkd",
                "cian6id",
                "kbmdnae",
                "stringToFind",
        };
        Arrays.sort(originStrings);
        LinkedList<String> strings = new LinkedList<String>();
        for (int i = 0; i < originStrings.length; i++) {
            strings.add(originStrings[i]);
            for (int j = 0; j < i; j++) {
                strings.add("");
            }
        }
        String[] res = new String[strings.size()];
        for (int i = 0; i < strings.size(); i++) {
            res[i] = strings.get(i);
        }
        return res;
    }

    @Test
    public void testSearch() throws Exception {
        String[] strings = makeStrings();
        assertEquals(-1, Ex4.search(strings, "NotFound"));
        int index = Ex4.search(strings, "stringToFind");
        assertEquals("stringToFind", strings[index]);
    }
}