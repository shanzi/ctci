package me.exercise;

/**
 * Created by Chase_Zhang on 12/8/14.
 */
public class Ex1 {
    // insert M to N

    public static int insertNumber(int M, int N, int i, int j) {
        int mask = (~(~0<<i) | (~0<<j));
        N = N & (mask);
        N = N | (M << i);
        return N;
    }
}
