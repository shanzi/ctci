package me.exercise;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class Ex13Test {

    int[] makeRandomArray() {
        int[] array = new int[100];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(200);
        }
        return array;
    }

    @Test
    public void testConvert() throws Exception {
        Ex13.BiNode root = Ex13.makeTree(makeRandomArray());
        Ex13.BiNode head = Ex13.convert(root);
        while (head.node2 != null) {
            assertTrue(head.data < head.node2.data);
            head = head.node2;
        }
    }
}