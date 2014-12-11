package me.exercise;

/**
 * Created by Chase_Zhang on 12/10/14.
 */
public class Ex1 {
    // number of way to go up stair;

    public static int numberOfWays(int n, int[]res) {
        if (n < 0) return 0;
        if (res[n] > 0) return res[n];

        int sum = numberOfWays(n - 1, res) + numberOfWays(n - 2, res) + numberOfWays(n - 3, res);
        res[n] = sum;
        return sum;
    }

    public static int numberOfWays(int n) {
        if (n < 0) return 0;
        else if (n == 0) return 1;
        else {
            int[] res = new int[n];
            res[0] = 1;
            return numberOfWays(n - 1, res) + numberOfWays(n - 2, res) + numberOfWays(n - 3, res);
        }
    }
}
