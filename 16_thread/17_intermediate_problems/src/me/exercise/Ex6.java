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
}
