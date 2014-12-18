package me.exercise;

import org.junit.Test;

import java.util.Dictionary;
import java.util.HashSet;

import static org.junit.Assert.*;

public class Ex14Test {
    HashSet<String> makeDictionary(String[] strings) {
        HashSet<String> dict = new HashSet<>(strings.length);
        for (int i = 0; i < strings.length; i++) {
            dict.add(strings[i]);
        }
        return dict;
    }
    @Test
    public void testParse() throws Exception {
        String sentence1 = "jesslookedjustliketimherbrother";
        String[] words1 = {"looked", "just", "like", "her", "brother"};
        HashSet<String> dictionary1 = makeDictionary(words1);

        Ex14.CutWordResult res1 = Ex14.parse(sentence1, dictionary1);
        assertEquals(7, res1.invalid);
        assertEquals("JESS looked just like TIM her brother", res1.bestString);


        String sentence2 = "thisisawesome";
        String[] words2 = {"this", "is", "awesome"};
        HashSet<String> dictionary2 = makeDictionary(words2);

        Ex14.CutWordResult res2 = Ex14.parse(sentence2, dictionary2);
        assertEquals(0, res2.invalid);
        assertEquals("this is awesome", res2.bestString);
    }
}