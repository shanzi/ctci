package me.exercise;

/**
 * Created by Chase_Zhang on 12/14/14.
 */
public class Ex5 {
    // find in matrix

    public static class Result {
        int x;
        int y;
        public Result(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static Result findInMatrix(int[][] mat, int value, int left, int top, int size) {
        if (mat[left][top] > value) return null;
        if (size <= 0) return null;
        if (size == 1) {
            if (mat[left][top] == value) return new Result(left, top);
            else return null;
        }

        int i = 0;
        int j = size - 1;

        if (mat[left+j][top+j] < value) return null;

        while (i < j - 1) {
            int mid = (i + j) / 2;
            if (value > mat[left+mid][top+mid]) {
                i = mid;
            } else if (value < mat[left+mid][top + mid]) {
                j = mid;
            } else {
                return new Result(left+mid, top+mid);
            }
        }

        if (mat[left+j][top+j] == value) return new Result(left, top);

        Result res = findInMatrix(mat, value, left + i, top, size - i);
        if (res == null) return findInMatrix(mat, value, left, top+j, size - j);

        return res;
    }

    public static Result findInMatrix(int[][] mat, int value) {
        if (mat == null || mat.length==0 || mat.length != mat[0].length) return null;
        return findInMatrix(mat, value, 0, 0, mat.length);
    }
}
