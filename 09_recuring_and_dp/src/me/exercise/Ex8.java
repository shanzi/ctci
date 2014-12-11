package me.exercise;


import java.util.Arrays;

/**
 * Created by Chase_Zhang on 12/11/14.
 */
public class Ex8 {
    // make charge

    private static int makeCharge(int[] chargeValues, int sum, int startIdx, int[][] cache) {
        if (sum == 0) return 1;
        if (startIdx >= chargeValues.length) return 0;
        if (cache[startIdx][sum] > 0) return cache[startIdx][sum];

        int value = chargeValues[startIdx];
        int countSum = 0;
        for (int i = 0; i <= sum; i+= value) {
            countSum += makeCharge(chargeValues, sum - i, startIdx+1, cache);
        }
        cache[startIdx][sum] = countSum;
        return countSum;
    }

    public static int makeCharge(int[] chargeValues, int sum) {
        Arrays.sort(chargeValues);
        for (int i = 0; i < chargeValues.length/2; i++) {
            int temp = chargeValues[i];
            chargeValues[i] = chargeValues[chargeValues.length - i - 1];
            chargeValues[chargeValues.length - i - 1] = temp;
        }
        int[][] cache = new int[chargeValues.length][sum+1];
        return makeCharge(chargeValues, sum, 0, cache);
    }
}
