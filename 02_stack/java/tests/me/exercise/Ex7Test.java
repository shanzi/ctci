package me.exercise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex7Test {
    private Ex7 ex7Solution;

    @Before
    public void setUp() throws Exception {
        ex7Solution = new Ex7();
    }

    @Test
    public void testCreateAnimalQueue() throws Exception {
        Ex7.AnimalQueue queue = ex7Solution.createAnimalQueue();

        for (int i = 0; i < 99; i++) {
            if (i%3 == 0) queue.addCat();
            else queue.addDog();
        }

        int lastOrder = Integer.MIN_VALUE;

        for (int i = 0; i < 44; i++) {
            Ex7.Animal dog = queue.getDog();
            assertEquals(dog.name, "dog");
            assertTrue(dog.order > lastOrder);
            lastOrder = dog.order;
        }

        lastOrder = Integer.MIN_VALUE;

        for (int i = 0; i < 11; i++) {
            Ex7.Animal cat = queue.getCat();
            assertEquals(cat.name, "cat");
            assertTrue(cat.order > lastOrder);
            lastOrder = cat.order;
        }

        lastOrder = Integer.MIN_VALUE;

        for (int i = 0; i < 44; i++) {
            Ex7.Animal ani = queue.dequeue();
            assertTrue(ani.order > lastOrder);
            lastOrder = ani.order;
        }
    }
}