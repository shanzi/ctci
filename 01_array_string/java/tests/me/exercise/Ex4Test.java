package me.exercise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex4Test {

    private Ex4 ex4Instace;

    @Before
    public void setUp() throws Exception {
        ex4Instace = new Ex4();
    }

    @Test
    public void testEscapeSpaceByCharArray() throws Exception {
        assertEquals("Replace space by char array",
                ex4Instace.escapeSpaceByCharArray("fasi asdf 2dfak asi23 asdkf! asdfi!"),
                "fasi%20asdf%202dfak%20asi23%20asdkf!%20asdfi!");

    }

    @Test
    public void testEscapeSpaceByStringBuffer() throws Exception {
        assertEquals("Replace space by string buffer",
                ex4Instace.escapeSpaceByStringBuffer("fasi asdf 2dfak asi23 asdkf! asdfi!"),
                "fasi%20asdf%202dfak%20asi23%20asdkf!%20asdfi!");
    }

    @Test
    public void testEscapeSpaceByReplace() throws Exception {
        assertEquals("Replace space by replace",
                ex4Instace.escapeSpaceByReplace("fasi asdf 2dfak asi23 asdkf! asdfi!"),
                "fasi%20asdf%202dfak%20asi23%20asdkf!%20asdfi!");
    }
}