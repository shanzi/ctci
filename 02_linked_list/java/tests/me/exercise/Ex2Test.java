package me.exercise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex2Test {

    private Ex2 ex2Solution;

    private int k = 5;
    private int[] zeroArray = {};
    private int[] smallArray = {1, 2, 3, 4};
    private int[] kArray = {1, 2, 3, 4, 5};
    private int[] bigArray = {1, 2, 3, 4, 5, 6, 7, 8};

    @Before
    public void setUp() throws Exception {
        ex2Solution = new Ex2();
    }

    @Test
    public void testFindLastElement() throws Exception {
        LinkedList zeroList = LinkedList.fromArray(zeroArray);
        LinkedList smallList = LinkedList.fromArray(smallArray);
        LinkedList kList = LinkedList.fromArray(kArray);
        LinkedList bigList = LinkedList.fromArray(bigArray);

        assertNull(ex2Solution.findLastElement(zeroList, k));
        assertNull(ex2Solution.findLastElement(smallList, k));

        assertNotNull(ex2Solution.findLastElement(kList, k));
        assertNotNull(ex2Solution.findLastElement(bigList, k));

        assertEquals(1, ex2Solution.findLastElement(kList, k).data);
        assertEquals(4, ex2Solution.findLastElement(bigList, k).data);
    }
}