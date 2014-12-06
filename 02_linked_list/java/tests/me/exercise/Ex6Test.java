package me.exercise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex6Test {

    private Ex6 ex6Solution;
    private LinkedList loopList;
    private LinkedListNode loopStartNode;
    private LinkedList nonLoopList;

    @Before
    public void setUp() throws Exception {
        ex6Solution = new Ex6();
        loopList = new LinkedList();
        nonLoopList = new LinkedList();
        for (int i = 0; i < 100; i++) {
            loopList.prepend(i);
            nonLoopList.prepend(i);
        }
        loopStartNode = loopList.head;
        while (loopStartNode.data != 81) loopStartNode = loopStartNode.next;

        LinkedListNode tail = loopList.tail();
        tail.next =loopStartNode;
    }

    @Test
    public void testFindLoopStart() throws Exception {
        assertNull(ex6Solution.findLoopStart(nonLoopList));
        assertEquals(81, ex6Solution.findLoopStart(loopList).data);
    }
}