package me.exercise;

import java.util.Arrays;

/**
 * Created by chase on 14-12-17.
 */
public class Ex6 {
    public static class Range {
        int start;
        int end;

        public Range(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static Range findRange(int[] array) {
        int[] newarray = array.clone();
        Arrays.sort(newarray);
        int start = 0;
        int end = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (newarray[i] != array[i]) {
                start = i;
                break;
            }
        }

        for (int i = array.length - 1; i >= 0; i--) {
            if (newarray[i] != array[i]){
                end = i;
                break;
            }
        }

        return new Range(start, end);
    }

    public static Range findRangeQuick(int[] array) {
        int start = 0;
        int end = array.length - 1;

        for (int i = 1; i < array.length-1; i++) {
            if (array[i-1] > array[i]) {
                start = i;
                break;
            }
        }

        for (int i = array.length-2; i > 0 ; i--) {
            if (array[i] > array[i+1]) {
                end = i+1;
                break;
            }
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = start; i <= end ; i++) {
            if (min > array[i]) min = array[i];
            else if (max < array[i]) max = array[i];
        }

        while(start > 0 && array[start] > min) start--;
        while(end < array.length && array[end] < max) end++;
        return new Range(start + 1, end - 1);
    }
}
