package me.exercise;

/**
 * Created by chase on 14-12-21.
 */
public class Ex12 {
    private static void clearArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    public static class MaxMatrixResult {
        int top;
        int left;
        int bottom;
        int right;
        int sum;

        public MaxMatrixResult(int top, int left, int bottom, int right, int sum) {
            this.top = top;
            this.left = left;
            this.bottom = bottom;
            this.right = right;
            this.sum = sum;
        }
    }

    public static MaxMatrixResult maxSubMatrix(int[][] mat) {
        int rowCount = mat.length;
        int colCount = mat[0].length;
        int[] colSum = new int[colCount];

        int maxTotalSum = 0;
        MaxMatrixResult maxResult = null;

        for (int rowStart = 0; rowStart < rowCount; rowStart++) {
            clearArray(colSum);
            for (int rowEnd = rowStart; rowEnd < rowCount; rowEnd++) {
                for (int i = 0; i < colCount; i++) {
                    colSum[i] += mat[rowEnd][i];
                }

                int maxSubSum = 0;
                int runningSubSum = 0;
                int runningLeft = 0;
                int left = 0;
                int right = 0;
                for (int i = 0; i < colCount; i++) {
                    runningSubSum += colSum[i];
                    if (runningSubSum < 0) {
                        runningSubSum = 0;
                        runningLeft = i;
                    } else if (runningSubSum > maxSubSum){
                        maxSubSum = runningSubSum;
                        left = runningLeft + 1;
                        right = i;
                    }
                }

                if (maxSubSum > maxTotalSum) {
                    maxTotalSum = maxSubSum;
                    maxResult = new MaxMatrixResult(rowStart, left, rowEnd, right, maxTotalSum);
                }
            }
        }
        return maxResult;
    }

}
