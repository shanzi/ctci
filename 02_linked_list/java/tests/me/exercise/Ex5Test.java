package me.exercise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex5Test {

    private Ex5 ex5Solution;

    private int[] aReversed = {1, 2, 8, 9};
    private int[] bReversed = {9, 9, 9};
    private int[] reversedRes = {0, 2, 8, 0, 1};

    private int[] aarray = {1, 2, 3, 6, 7, 8, 9};
    private int[] barray = {9, 9, 9};
    private int[] res = {1, 2, 3, 7, 7, 8, 8};

    private int[] carray = {9, 9, 9};
    private int[] darray = {9, 9, 9, 9};
    private int[] res2 = {1, 0, 9, 9, 8};

    @Before
    public void setUp() throws Exception {
        ex5Solution = new Ex5();
    }

    @Test
    public void testAddReversedList() throws Exception {
        LinkedList a = LinkedList.fromArray(aReversed);
        LinkedList b = LinkedList.fromArray(bReversed);

        LinkedList res = ex5Solution.addReversedList(a, b);
        assertArrayEquals(reversedRes, res.toArray());

    }

    @Test
    public void testAddList() throws Exception {
        LinkedList a = LinkedList.fromArray(aarray);
        LinkedList b = LinkedList.fromArray(barray);
        LinkedList resList = ex5Solution.addList(a, b);
        assertArrayEquals(res, resList.toArray());

        a = LinkedList.fromArray(carray);
        b = LinkedList.fromArray(darray);
        resList = ex5Solution.addList(a, b);
        assertArrayEquals(res2, resList.toArray());
    }
}