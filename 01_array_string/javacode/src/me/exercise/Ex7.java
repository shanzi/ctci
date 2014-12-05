package me.exercise;

/**
 * Created by chase on 14-12-5.
 */
public class Ex7 {
    // clear matrix's row and column if there exists a zero element in the row and column

    public int[][] makeMatrixWithZeros(int sizeX, int sizeY, int[] zeroRows, int[] zeroColumns) {
        if (zeroRows.length != zeroColumns.length) {
            throw new Error("zeroRows must be the same length with zeroColumns");
        }

        int[][] matrix = new int[sizeX][sizeY];
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                matrix[i][j] = 1 + i + j;
            }
        }

        for (int i = 0; i < zeroRows.length; i++) {
            int x = zeroRows[i];
            int y = zeroColumns[i];
            matrix[x][y] = 0;
        }
        return matrix;
    }

    public void clearRowsAndColumnsWithZeroElement(int[][]mat) {
        int sizeX = mat.length;
        int sizeY = mat[0].length;

        boolean[] zeroRows = new boolean[sizeX];
        boolean[] zeroCols = new boolean[sizeY];

        for (int x = 0; x < sizeX; x++) {
            for (int y = 0; y < sizeY; y++) {
                if (mat[x][y] == 0) {
                    zeroRows[x] = true;
                    zeroCols[y] = true;
                }
            }
        }

        for (int i = 0; i < sizeX; i++) {
            if (zeroRows[i]) {
                for (int j = 0; j < sizeY; j++) {
                    mat[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < sizeY; i++) {
            if (zeroCols[i]) {
                for (int j = 0; j < sizeX; j++) {
                    mat[j][i] = 0;
                }
            }
        }
    }
}
