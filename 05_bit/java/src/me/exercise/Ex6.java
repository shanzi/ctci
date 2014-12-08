package me.exercise;

/**
 * Created by Chase_Zhang on 12/8/14.
 */
public class Ex6 {
    // exchange bits in odd and even positions

    public static int swapOddEvenBits(int x) {
        return ((x & 0xaaaaaaaa) >> 1) | ((x & 0x55555555) << 1);
    }
}
