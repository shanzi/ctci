package me.exercise;

/**
 * Created by Chase_Zhang on 12/4/14.
 */
public class Ex6 {
    // rotate matrix

    public int[][] makeMatrix(int size) {
        int[][] matrix = new int[size][size];
        int num = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = num;
                num++;
            }
        }
        return matrix;
    }

    public int[][] makeRotatedMatrix(int size) {
        int[][] matrix = new int[size][size];
        int num = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[j][size-i-1] = num;
                num++;
            }
        }
        return matrix;
    }

    public boolean matrixEquals(int[][] mat1, int[][] mat2) {
        int size1 = mat1.length;
        int size2 = mat2.length;

        if (size1 != size2) return false;

        int size = size1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (mat1[i][j] != mat2[i][j]) return false;
            }
        }
        return true;
    }

    private void swapElements(int[][] mat, int x1, int y1, int x2, int y2) {
        int temp = mat[x1][y1];
        mat[x1][y1] = mat[x2][y2];
        mat[x2][y2] = temp;
    }

    public void rotateMatrix(int[][] mat) {
        int size = mat.length;
        for (int i = 0; i < size / 2; i++) {
            for (int j = i; j < size-i-1; j++) {
                swapElements(mat, i, j, size-j-1, i);
                swapElements(mat, size-j-1, i, size-i-1, size-j-1);
                swapElements(mat, size-i-1, size-j-1, j, size-i-1);
            }
        }
    }
}
