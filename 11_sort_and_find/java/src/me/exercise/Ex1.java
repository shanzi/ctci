package me.exercise;

/**
 * Created by Chase_Zhang on 12/12/14.
 */
public class Ex1 {
    // merge array
    public static void mergeBtoA(int[] A, int[] B) {
        int lastAIndex = A.length - B.length - 1;
        int lastBIndex = B.length - 1;
        int current = A.length - 1;
        for (int i = lastBIndex; i >= 0 ; i--) {
            while (lastAIndex >= 0 &&  A[lastAIndex] > B[i]) {
                A[current] = A[lastAIndex];
                current--;
                lastAIndex--;
            }
            A[current] = B[i];
            current--;
        }
    }
}
