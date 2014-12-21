package me.exercise;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class Ex10Test {

    HashSet<String> makeDictionary() {
        String[] words = {
                "dog",
                "cat",
                "pen",
                "dat",
                "cap",
                "dag",
                "bag",
        };
        HashSet<String> res = new HashSet<String>();
        for (String word : words) {
            res.add(word);
        }
        return res;
    }

    @Test
    public void testTransform() throws Exception {
        HashSet<String> dict = makeDictionary();
        LinkedList<String> path = Ex10.transform("dog", "cat", dict);

        assertEquals("dog", path.get(0));
        assertEquals("dag", path.get(1));
        assertEquals("dat", path.get(2));
        assertEquals("cat", path.get(3));

        LinkedList<String> nullPath = Ex10.transform("dog", "pen", dict);

        assertNull(nullPath);
    }
}