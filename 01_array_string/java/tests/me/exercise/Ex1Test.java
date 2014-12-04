package me.exercise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex1Test {

    private Ex1 ex1Instance;

    @Before
    public void setUp() throws Exception {
        ex1Instance = new Ex1();
    }

    @Test
    public void testCheckCharactersAllDifferent() throws Exception {
        assertTrue("A string which every characters are different", ex1Instance.checkCharactersAllDifferent("abcdefghijk"));
        assertFalse("A string which as one characters appears more than once", ex1Instance.checkCharactersAllDifferent("abcdeifhhasjfwe"));
    }

    @Test
    public void testCheckCharactersAllDifferentBinary() throws Exception {
        assertTrue("A string which every characters are different", ex1Instance.checkCharactersAllDifferentBinary("abcdefghijk"));
        assertFalse("A string which as one characters appears more than once", ex1Instance.checkCharactersAllDifferentBinary("abcdeifhhasjfwe"));
    }

    @Test
    public void testCheckCharactersAllDifferentNoOtherStructure() throws Exception {

        assertTrue("A string which every characters are different", ex1Instance.checkCharactersAllDifferentNoOtherStructure("abcdefghijk"));
        assertFalse("A string which as one characters appears more than once", ex1Instance.checkCharactersAllDifferentNoOtherStructure("abcdeifhhasjfwe"));
    }
}