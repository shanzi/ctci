package me.exercise;

/**
 * Created by Chase_Zhang on 12/17/14.
 */
public class Ex8 {

    public static class Result {
        int start;
        int end;
        int sum;


        public Result(int start, int end, int sum) {
            this.start = start;
            this.end = end;
            this.sum = sum;
        }
    }

    public static Result maxSumSubSeq(int[] seq) {
        int minSum = 0;
        int minSumPos = -1;

        int minSumPosAc = -1;
        int maxSumPosAc = 0;
        int subseqSum = 0;

        int sum = 0;

        for (int i = 0; i < seq.length; i++) {
            sum += seq[i];
            if (sum < minSum) {
                minSum = sum;
                minSumPos = i;
            }

            if (sum - minSum > subseqSum) {
                minSumPosAc = minSumPos;
                maxSumPosAc = i;
                subseqSum = sum - minSum;
            }
        }

        if (minSumPosAc < maxSumPosAc) minSumPosAc++;

        return new Result(minSumPosAc, maxSumPosAc, subseqSum);
    }
}
