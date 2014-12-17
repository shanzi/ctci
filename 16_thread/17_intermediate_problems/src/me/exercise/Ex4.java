package me.exercise;

/**
 * Created by chase on 14-12-17.
 */
public class Ex4 {
    public static int max(int a, int b) {
        return ((a + b) + (int)Math.sqrt((a - b) * (a - b)))/2;
    }
}
