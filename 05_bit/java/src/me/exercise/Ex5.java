package me.exercise;

/**
 * Created by Chase_Zhang on 12/8/14.
 */
public class Ex5 {
    // count different bits

    public static int countOfDifferentBits(int M, int N) {
        int diff = M ^ N;
        int count = 0;
        while (diff > 0) {
            count += diff & 1;
            diff >>= 1;
        }
        return count;
    }
}
