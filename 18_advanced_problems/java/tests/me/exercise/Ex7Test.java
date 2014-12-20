package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex7Test {

    @Test
    public void testGetLongestWord() throws Exception {
        String[] words = {"cat", "dog", "banana", "nana", "walk", "walker", "dogwalker"};
        assertEquals("dogwalker", Ex7.getLongestWord(words));

    }
}