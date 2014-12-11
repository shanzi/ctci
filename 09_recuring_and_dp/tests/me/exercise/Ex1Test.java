package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex1Test {

    @Test
    public void testNumberOfWays() throws Exception {

        assertEquals(1, Ex1.numberOfWays(1));
        assertEquals(2, Ex1.numberOfWays(2));
        assertEquals(4, Ex1.numberOfWays(3));

        assertEquals(13, Ex1.numberOfWays(5));

    }
}