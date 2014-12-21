package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex11Test {

    int[][] makeMat(int top, int left, int maxSize, int matSize) {
        int[][] res = new int[matSize][matSize];
        for (int x = 0; x < matSize; x++) {
            for (int y = 0; y < matSize; y++) {
                res[x][y] = (x + y) % 2;
            }
        }
        for (int i = 0; i < maxSize; i++) {
            res[top][left + i] = 1;
            res[top + maxSize - 1][left + i] = 1;
            res[top + i][left] = 1;
            res[top + i][left + maxSize - 1] = 1;
        }
        return res;
    }

    @Test
    public void testFindLargest() throws Exception {
        int[][] mat1 = makeMat(7, 11, 13, 50);
        Ex11.RectResult res1 = Ex11.findLargest(mat1);
        assertEquals(7, res1.x);
        assertEquals(11, res1.y);
        assertEquals(13, res1.size);

        int[][] mat2 = makeMat(0, 0, 0, 50);
        Ex11.RectResult res2 = Ex11.findLargest(mat2);
        assertEquals(1, res2.size);

        int[][] mat3 = new int[50][50];
        Ex11.RectResult res3 = Ex11.findLargest(mat3);
        assertNull(res3);
    }
}