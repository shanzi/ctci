package me.exercise;

import org.junit.Before;
import org.junit.Test;
import sun.awt.image.ImageWatched;

import static org.junit.Assert.*;

public class Ex3Test {

    private Ex3 ex3Solution;
    private int[] array = {1, 2, 3, 4, 5};
    private int[] deleted = {1, 2, 4, 5};

    @Before
    public void setUp() throws Exception {
        ex3Solution = new Ex3();
    }

    @Test
    public void testDeleteCurrrentNode() throws Exception {
        LinkedList list = LinkedList.fromArray(array);
        LinkedListNode third = list.head.next.next;
        ex3Solution.deleteCurrrentNode(third);
        assertArrayEquals(deleted, list.toArray());
    }

    @Test(expected = Exception.class)
    public void testThrowExceptionOnDeleteTail() throws Exception {
        LinkedList list = LinkedList.fromArray(array);
        LinkedListNode tail = list.tail();
        ex3Solution.deleteCurrrentNode(tail);
    }
}