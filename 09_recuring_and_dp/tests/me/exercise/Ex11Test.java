package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex11Test {

    @Test
    public void testWaysOfExpression() throws Exception {
        assertEquals(0, Ex11.waysOfExpression("0|0", true));
        assertEquals(0, Ex11.waysOfExpression("0|1", false));
        assertEquals(1, Ex11.waysOfExpression("1&1", true));
        assertEquals(2, Ex11.waysOfExpression("1&1|0^1", true));
        assertEquals(2, Ex11.waysOfExpression("1^0|0|1", false));
    }
}