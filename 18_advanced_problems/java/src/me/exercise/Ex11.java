package me.exercise;

/**
 * Created by chase on 14-12-21.
 */
public class Ex11 {
    public static class RectResult {
        int x;
        int y;
        int size;

        public RectResult(int x, int y, int size) {
            this.x = x;
            this.y = y;
            this.size = size;
        }
    }
    private static class MatRecord {
        int right = 0;
        int below = 0;
    }

    private static MatRecord[][] processMat(int[][] mat) {
        int dimen = mat.length;
        MatRecord[][] matrec = new MatRecord[dimen][dimen];
        for (int x = dimen-1; x >= 0 ; x--) {
            for (int y = dimen-1; y >= 0 ; y--) {
                MatRecord mr = new MatRecord();
                if (mat[x][y] == 1) {
                    if (x + 1 < dimen) {
                        mr.below = matrec[x + 1][y].below + 1;
                    } else {
                        mr.below = 1;
                    }
                    if (y + 1 < dimen) {
                        mr.right = matrec[x][y + 1].right + 1;
                    } else {
                        mr.right = 1;
                    }
                }
                matrec[x][y] = mr;
            }
        }
        return matrec;
    }

    public static RectResult findLargest(int[][] mat) {
        MatRecord[][] mr = processMat(mat);
        for (int k= mr.length-1; k >= 0; k--) {
            for (int i = 0; i < mr.length - k; i++) {
                for (int j = 0; j < mr.length - k; j++) {
                    int localLargest = k + 1;
                    MatRecord topLeft = mr[i][j];
                    if (topLeft.right >= localLargest && topLeft.below >= localLargest) {
                        MatRecord topRight = mr[i][j+localLargest-1];
                        MatRecord bottomLeft = mr[i+localLargest-1][j];
                        if (topRight.below >= localLargest && bottomLeft.right >= localLargest) {
                            return new RectResult(i, j, localLargest);
                        }
                    }
                }
            }
        }
        return null;
    }
}
