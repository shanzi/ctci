package me.exercise;

import java.util.Arrays;

/**
 * Created by Chase_Zhang on 12/12/14.
 */
public class Ex3 {
    // find in rotated sorted array
    private static int search(int[] array, int value, int start, int end) {
        if (start > end) return -1;
        if (start == end && array[start] == value) return start;

        int mid = (start + end) / 2;
        int startVal = array[start];
        int midVal = array[mid];
        int endVal = array[end];

        if (midVal > startVal) {
            if (startVal == value) return start;
            else if (midVal == value) return mid;
            else if (startVal < value && midVal > value) return search(array, value, start + 1, mid - 1);
            else return search(array, value, mid + 1, end);
        } else if (midVal < endVal) {
            if (endVal == value) return end;
            else if (midVal == value) return mid;
            else if (midVal <= value && endVal >= value) return search(array, value, mid + 1, end - 1);
            else return search(array, value, start, mid - 1);
        } else {
            if (startVal == value) return start;
            else if (midVal != endVal) return search(array, value, mid+1, end);
            else {
                int left = search(array, value, start+1, mid-1);

                if (left >= 0) return left;
                else return search(array, value, mid+1, end-1);
            }
        }
    }

    public static int search(int[] array, int value) {
        return search(array, value, 0, array.length - 1);
    }
}
