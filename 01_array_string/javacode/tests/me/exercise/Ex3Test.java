package me.exercise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex3Test {

    private Ex3 ex3Instance;

    @Before
    public void setUp() throws Exception {
        ex3Instance = new Ex3();
    }

    @Test
    public void testCheckAnagramBySort() throws Exception {
        assertTrue("An anagram example", ex3Instance.checkAnagramBySort("abcdefgga", "cdagabegf"));
        assertFalse("An non-anagram example", ex3Instance.checkAnagramBySort("abcdefggaadff", "cdagabegfffid"));
    }

    @Test
    public void testCheckAnagramByCountChars() throws Exception {
        assertTrue("An anagram example", ex3Instance.checkAnagramByCountChars("abcdefgga", "cdagabegf"));
        assertFalse("An non-anagram example", ex3Instance.checkAnagramByCountChars("abcdefggaadff", "cdagabegfffid"));
    }
}