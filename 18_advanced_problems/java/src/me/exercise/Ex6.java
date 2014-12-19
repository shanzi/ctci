package me.exercise;

import java.util.Random;

/**
 * Created by chase on 14-12-19.
 */
public class Ex6 {
    // k-th min/max element

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    private static int partition(int[] array, int left, int right, int pivot) {
        while (true) {
            while (left <= right && array[left] < pivot) {
                left++;
            }

            while (right >= left && array[right] >= pivot) {
                right--;
            }

            if (left > right) return left - 1;

            swap(array, left, right);
        }
    }

    private static int randomInRange(int left, int right) {
        if (right - left < 2) {
            return left;
        }
        Random rand = new Random();
        return left + rand.nextInt(right - left);
    }

    private static int max(int[] array, int left, int right) {
        int maxnum = array[left];
        for (int i = left; i <= right; i++) {
            if (array[i] > maxnum) maxnum = array[i];
        }
        return maxnum;
    }

    private static int rank(int[] array, int left, int right, int rank) {
        int pivot = array[randomInRange(left, right)];
        int leftEnd = partition(array, left, right, pivot);
        int leftSize = leftEnd - left + 1;
        if (leftSize == rank + 1) {
            return max(array, left, leftEnd);
        } else if (rank < leftSize) {
            return rank(array, left, leftEnd, rank);
        } else {
            return rank(array, leftEnd + 1, right, rank - leftSize);
        }
    }

    public static int rank(int[] array, int k) {
        return rank(array, 0, array.length-1, k);
    }
}
