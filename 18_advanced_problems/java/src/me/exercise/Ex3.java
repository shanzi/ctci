package me.exercise;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by chase on 14-12-19.
 */
public class Ex3 {
    // pick m numbers out from n numbers
    static int[] pickNumbers(int[] array, int m) {
        if (m >= array.length) return array;

        int[] res = new int[m];
        for (int i = 0; i < m; i++) {
            res[i] = i;
        }

        Random rand = new Random();
        for (int i = m; i < array.length; i++) {
            int k = rand.nextInt(array.length);
            if (k < m) {
                res[k] = array[i];
            }
        }
        Arrays.sort(res);
        return res;
    }

    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i;
        }

        int[] subset = pickNumbers(array, 10);
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", subset[i]);
        }
        System.out.println();
    }
}
