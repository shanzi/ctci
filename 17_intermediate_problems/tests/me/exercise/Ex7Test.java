package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex7Test {

    @Test
    public void testNumToString() throws Exception {
        assertEquals("Zero", Ex7.numToString(0));
        assertEquals("Ten", Ex7.numToString(10));
        assertEquals("Eleven", Ex7.numToString(11));
        assertEquals("Sixteen", Ex7.numToString(16));
        assertEquals("Twenty One", Ex7.numToString(21));

        assertEquals("One Hundred", Ex7.numToString(100));
        assertEquals("One Hundred Eleven", Ex7.numToString(111));
        assertEquals("Two Hundred Seventeen", Ex7.numToString(217));
        assertEquals("Five Hundred Fifty Three", Ex7.numToString(553));

        assertEquals("One Thousand", Ex7.numToString(1000));
        assertEquals("One Thousand Twelve", Ex7.numToString(1012));
        assertEquals("One Thousand Four Hundred Forty", Ex7.numToString(1440));
        assertEquals("Nine Thousand Four Hundred Five", Ex7.numToString(9405));

        assertEquals("One Million", Ex7.numToString(1000000));
        assertEquals("Ten Million", Ex7.numToString(10000000));
        assertEquals("Eleven Million One Hundred Twenty Six Thousand Three Hundred Thirty Eight", Ex7.numToString(11126338));


        assertEquals("Negative Ten", Ex7.numToString(-10));
        assertEquals("Negative Eleven", Ex7.numToString(-11));
        assertEquals("Negative Sixteen", Ex7.numToString(-16));
        assertEquals("Negative Twenty One", Ex7.numToString(-21));

        assertEquals("Negative One Hundred", Ex7.numToString(-100));
        assertEquals("Negative One Hundred Eleven", Ex7.numToString(-111));
        assertEquals("Negative Two Hundred Seventeen", Ex7.numToString(-217));
        assertEquals("Negative Five Hundred Fifty Three", Ex7.numToString(-553));

        assertEquals("Negative One Thousand", Ex7.numToString(-1000));
        assertEquals("Negative One Thousand Twelve", Ex7.numToString(-1012));
        assertEquals("Negative One Thousand Four Hundred Forty", Ex7.numToString(-1440));
        assertEquals("Negative Nine Thousand Four Hundred Five", Ex7.numToString(-9405));

    }
}