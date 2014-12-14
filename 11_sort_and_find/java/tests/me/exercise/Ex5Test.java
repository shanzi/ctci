package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex5Test {
    int[][] makeMatrix() {
        int[][] mat = new int[10][10];

        for (int i = 0; i < 100; i++) {
            mat[i/10][i%10] = i;
        }
        return mat;
    }

    @Test
    public void testFindInMatrix() throws Exception {
        int [][] mat = makeMatrix();
        assertNull(Ex5.findInMatrix(mat, 100));
        assertNull(Ex5.findInMatrix(mat, -1));
        Ex5.Result res = Ex5.findInMatrix(mat, 11);
        assertNotNull(res);
        assertEquals(11, mat[res.x][res.y]);
    }
}