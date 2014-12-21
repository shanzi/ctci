package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex12Test {

    void fillMatrix(int[][] mat, int value, int top, int left, int bottom, int right) {
        for (int i = top; i <= bottom ; i++) {
            for (int j = left; j <= right; j++) {
                mat[i][j] = value;
            }
        }
    }

    @Test
    public void testMaxSubMatrix() throws Exception {
        int[][] mat1 = new int[27][23];
        fillMatrix(mat1, -1, 0, 0, 26, 22);
        assertNull(Ex12.maxSubMatrix(mat1));

        fillMatrix(mat1, 1, 5, 7, 11, 13);
        Ex12.MaxMatrixResult res = Ex12.maxSubMatrix(mat1);
        assertEquals(5, res.top);
        assertEquals(7, res.left);
        assertEquals(11, res.bottom);
        assertEquals(13, res.right);
        assertEquals(49, res.sum);
    }
}