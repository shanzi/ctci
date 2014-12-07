package me.exercise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex5Test {

    private Ex5 ex5Solution;

    @Before
    public void setUp() throws Exception {
        ex5Solution = new Ex5();
    }

    @Test
    public void testCreateStackQueue() throws Exception {
        Ex5.StackQueue queue = ex5Solution.createStackQueue();

        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }

        for (int i = 0; i < 5; i++) {
            assertEquals(i, queue.dequeue());
        }

        for (int i = 10; i < 20; i++) {
           queue.enqueue(i);
        }

        for (int i = 5; i < 15; i++) {
            assertEquals(i, queue.dequeue());
        }

        for (int i = 20; i < 25; i++) {
            queue.enqueue(i);
        }

        for (int i = 15; i < 25; i++) {
            assertEquals(i, queue.dequeue());
        }
    }
}