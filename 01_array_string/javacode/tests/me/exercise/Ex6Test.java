package me.exercise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex6Test {

    private Ex6 ex6Instance;

    private void outputMatrix(int[][] mat) {
        int size = mat.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.format("%5d", mat[i][j]);
            }
            System.out.print('\n');
        }
        System.out.print('\n');
    }

    @Before
    public void setUp() throws Exception {
        ex6Instance = new Ex6();
    }

    @Test
    public void testRotateMatrix() throws Exception {
        // even size matrix
        int[][] mat = ex6Instance.makeMatrix(10);
        int[][] matRotated = ex6Instance.makeRotatedMatrix(10);

        outputMatrix(mat);
        ex6Instance.rotateMatrix(mat);
        outputMatrix(mat);

        assertTrue("Rotated mat should equals matRotated", ex6Instance.matrixEquals(mat, matRotated));

        mat = ex6Instance.makeMatrix(11);
        matRotated = ex6Instance.makeRotatedMatrix(11);
        ex6Instance.rotateMatrix(mat);
        assertTrue("Rotated mat should equals matRotated", ex6Instance.matrixEquals(mat, matRotated));
    }
}