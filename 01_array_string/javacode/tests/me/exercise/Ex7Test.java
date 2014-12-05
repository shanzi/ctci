package me.exercise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex7Test {

    private Ex7 ex7instance;
    private int[] zeroRows = {1, 3, 5, 7};
    private int[] zeroCols = {2, 4, 6, 8};

    @Before
    public void setUp() throws Exception {
        ex7instance = new Ex7();
    }

    private boolean checkZeroRowsAndColumns(int[][] mat) {
        int sizeX = mat.length;
        int sizeY = mat[0].length;

        for (int row : zeroRows) {
            for (int i = 0; i < sizeY; i++) {
                if (mat[row][i] != 0) return false;
            }
        }

        for (int col : zeroCols) {
            for (int i = 0; i < sizeX; i++) {
                if (mat[i][col] != 0) return false;
            }
        }

        return true;
    }

    private boolean intInList(int[] list, int ele) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == ele) return true;
        }
        return false;
    }

    private boolean checkNonZeroElements(int[][] mat) {
        for (int x = 0; x < mat.length; x++) {
            if (intInList(zeroRows, x)) continue;
            for (int y = 0; y < mat[0].length; y++) {
                if (intInList(zeroCols, y)) continue;

                if (mat[x][y] == 0) return false;
            }
        }
        return true;
    }

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

    @Test
    public void testClearRowsAndColumnsWithZeroElement() throws Exception {
        int[][] mat = ex7instance.makeMatrixWithZeros(10, 11, zeroRows, zeroCols);
        outputMatrix(mat);
        ex7instance.clearRowsAndColumnsWithZeroElement(mat);
        outputMatrix(mat);
        assertTrue("cols and rows should be zero", checkZeroRowsAndColumns(mat));
        assertTrue("all other elements should not be zero", checkNonZeroElements(mat));
    }


}