package me.exercise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex5Test {

    private Ex5 ex5Instance;

    private String emptyStr = "";
    private String emptyStrCompressed = "";

    private String string1 = "abcdefghabcdefgh";
    private String string1Compressed = "abcdefghabcdefgh";

    private String string2 = "aaaabbcccddddddeeeff";
    private String string2Compressed = "a4b2c3d6e3f2";

    @Before
    public void setUp() throws Exception {
        ex5Instance = new Ex5();
    }

    @Test
    public void testCompressStringWithStringBuffer() throws Exception {
        assertEquals("This string should be compressed", string2Compressed, ex5Instance.compressStringWithStringBuffer(string2));
        assertEquals("This string should not be compressed", string1Compressed, ex5Instance.compressStringWithStringBuffer(string1));
        assertEquals("Empty string should not be compressed", emptyStrCompressed, ex5Instance.compressStringWithStringBuffer(emptyStr));
    }

    @Test
    public void testCompressStringWithCharArray() throws Exception {
        assertEquals("This string should be compressed", string2Compressed, ex5Instance.compressStringWithCharArray(string2));
        assertEquals("This string should not be compressed", string1Compressed, ex5Instance.compressStringWithCharArray(string1));
        assertEquals("Empty string should not be compressed", emptyStrCompressed, ex5Instance.compressStringWithCharArray(emptyStr));
    }
}