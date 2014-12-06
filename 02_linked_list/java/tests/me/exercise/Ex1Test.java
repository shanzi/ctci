package me.exercise;

import org.junit.Before;
import org.junit.Test;
import sun.awt.image.ImageWatched;

import static org.junit.Assert.*;

public class Ex1Test {

    private Ex1 ex1Solution;
    private int[] zeroArray = {};
    private int[] oneArray = {1};
    private int[] noDuplicatedArray = {1, 2, 3, 4, 5};
    private int[] duplicatedArray = {1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 5};

    @Before
    public void setUp() throws Exception {
        ex1Solution = new Ex1();
    }

    @Test
    public void testRemoveDuplicatedNodesWithBuffer() throws Exception {
        LinkedList zeroList = LinkedList.fromArray(zeroArray);
        LinkedList oneList = LinkedList.fromArray(oneArray);
        LinkedList noDupList = LinkedList.fromArray(noDuplicatedArray);
        LinkedList dupList = LinkedList.fromArray(duplicatedArray);

        ex1Solution.removeDuplicatedNodesWithBuffer(zeroList);
        ex1Solution.removeDuplicatedNodesWithBuffer(oneList);
        ex1Solution.removeDuplicatedNodesWithBuffer(noDupList);
        ex1Solution.removeDuplicatedNodesWithBuffer(dupList);

        assertArrayEquals("zero list", zeroArray, zeroList.toArray());
        assertArrayEquals("one list", oneArray, oneList.toArray());
        assertArrayEquals("nodup list", noDuplicatedArray, noDupList.toArray());
        assertArrayEquals("dup list", noDuplicatedArray, dupList.toArray());
    }

    @Test
    public void testRemoveDuplicatedNodesWithoutBuffer() throws Exception {
        LinkedList zeroList = LinkedList.fromArray(zeroArray);
        LinkedList oneList = LinkedList.fromArray(oneArray);
        LinkedList noDupList = LinkedList.fromArray(noDuplicatedArray);
        LinkedList dupList = LinkedList.fromArray(duplicatedArray);

        ex1Solution.removeDuplicatedNodesWithoutBuffer(zeroList);
        ex1Solution.removeDuplicatedNodesWithoutBuffer(oneList);
        ex1Solution.removeDuplicatedNodesWithoutBuffer(noDupList);
        ex1Solution.removeDuplicatedNodesWithoutBuffer(dupList);

        assertArrayEquals("zero list", zeroArray, zeroList.toArray());
        assertArrayEquals("one list", oneArray, oneList.toArray());
        assertArrayEquals("nodup list", noDuplicatedArray, noDupList.toArray());
        assertArrayEquals("dup list", noDuplicatedArray, dupList.toArray());
    }
}