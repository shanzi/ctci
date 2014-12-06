package me.exercise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex4Test {

    private Ex4 ex4Solution;

    private int x = 5;
    private int[] array = {3,6,1,4,8,4,5,3,7,9,2,0};
    private int[] arranged = {3,1,4,4,3,2,0,6,8,5,7,9};

    @Before
    public void setUp() throws Exception {
        ex4Solution = new Ex4();
    }

    @Test
    public void testSplitList() throws Exception {
        LinkedList list = LinkedList.fromArray(array);
        ex4Solution.splitList(list, x);
        assertArrayEquals(arranged, list.toArray());
    }
}