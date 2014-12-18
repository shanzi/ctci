package me.exercise;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class Ex1Test {

    @Test
    public void testAdd() throws Exception {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int random1 = rand.nextInt(10000);
            int random2 = rand.nextInt(10000);
            assertEquals(random1 + random2, Ex1.add(random1, random2));
        }
    }
}