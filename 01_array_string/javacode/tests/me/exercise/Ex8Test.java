package me.exercise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex8Test {

    private Ex8 ex8instance;

    private String origin = "abcdefghijk";
    private String rotated = "efghijkabcd";
    private String notRotated = "efghijkdcba";
    private String notRotated2 = "efghijkkabcd";

    @Before
    public void setUp() throws Exception {
        ex8instance = new Ex8();
    }

    @Test
    public void testIsStringFromRotate() throws Exception {
        assertTrue("String is from rotation", ex8instance.isStringFromRotate(rotated, origin));
        assertFalse("String is not from rotation", ex8instance.isStringFromRotate(notRotated, origin));
        assertFalse("String is not from rotation", ex8instance.isStringFromRotate(notRotated2, origin));
    }
}