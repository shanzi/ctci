package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex1Test {

    @Test
    public void testMergeBtoA() throws Exception {

        int[] A = new int[100];
        int[] B = new int[30];
        int[] C = new int[100];

        for (int i = 0; i < 100; i++) {
            if (i < 70) A[i] = i;
            else B[i-70] = i;
            C[i] = i;
        }

        Ex1.mergeBtoA(A, B);
        assertArrayEquals(C, A);

        for (int i = 0; i < 100; i++) {
            if (i < 30) B[i] = i;
            else A[i-30] = i;
        }

        Ex1.mergeBtoA(A, B);
        assertArrayEquals(C, A);

        for (int i = 0; i < 140; i+=2) {
            A[i/2] = i;
        }

        for (int i = 1; i < 61; i+=2) {
            B[i/2] = i;
        }

        for (int i = 61; i < 100 ; i++) {
            C[i] = i * 2 - 60;
        }

        Ex1.mergeBtoA(A, B);
        assertArrayEquals(C, A);
    }
}