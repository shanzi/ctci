package me.exercise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex7Test {

    private Ex7 ex7Solution;
    private int[] pOddArray = {9, 8, 7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private int[] pEvenArray = {9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private int[] nOddArray = {9, 8, 7, 7, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private int[] nEvenArray = {9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 2, 3, 4, 5, 7, 7, 8, 10};

    @Before
    public void setUp() throws Exception {
        ex7Solution = new Ex7();
    }

    @Test
    public void testCheckPalindromeByIteration() throws Exception {
        LinkedList pOddList = LinkedList.fromArray(pOddArray);
        LinkedList pEvenList = LinkedList.fromArray(pEvenArray);
        LinkedList nOddList = LinkedList.fromArray(nOddArray);
        LinkedList nEvenList = LinkedList.fromArray(nEvenArray);

        assertTrue(ex7Solution.checkPalindromeByIteration(pOddList));
        assertTrue(ex7Solution.checkPalindromeByIteration(pEvenList));

        assertFalse(ex7Solution.checkPalindromeByIteration(nOddList));
        assertFalse(ex7Solution.checkPalindromeByIteration(nEvenList));
    }
}