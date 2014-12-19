package me.exercise;

/**
 * Created by chase on 14-12-19.
 */
public class Ex4 {
    // count 2s in 0 to n

    public static int count2(int n) {
        if (n < 2) return 0;
        int m = 10;
        while (m < n) m *= 10;
        m /= 10;

        int count = 0;
        int a = n / m;
        int b = n % m;
        if (a > 2) {
            count += m;
        }
        else if (a == 2) {
            count += b + 1;
        }
        count += a * count2(m);
        count += count2(b);
        return count;
    }

    private static int count2sAtDigit(int n, int d) {
        int powerOf10 = (int)Math.pow(10, d);
        int nextPowerOf10 = (int)Math.pow(10, d+1);

        int right = n % powerOf10;
        int roundDown = n - n % nextPowerOf10;
        int roundUp = roundDown + nextPowerOf10;

        int digit = (n / powerOf10) % 10;
        if (digit < 2) {
            return roundDown / 10;
        } else if (digit > 2) {
            return roundUp / 10;
        } else {
            return roundDown / 10 + right + 1;
        }
    }

    public static int count2sInRange(int number) {
        int count = 0;
        int len = 0;
        while (number >= Math.pow(10, len)) len++;
        for (int digit = 0; digit < len; digit++) {
            count += count2sAtDigit(number, digit);
        }
        return count;
    }
}
