package me.exercise;

import java.util.ArrayList;

/**
 * Created by Chase_Zhang on 12/8/14.
 */
public class Ex7 {
    // find a missing number in bit integer

    public static int findMissingNumber(ArrayList<Integer> input, int column, int size) {
        if (column >= size) return 0;

        ArrayList<Integer> zeroList = new ArrayList<Integer>();
        ArrayList<Integer> oneList = new ArrayList<Integer>();

        int mask =  (1 << column);
        for (Integer i : input) {
            if ((i.intValue() &  mask) > 0) {
                oneList.add(i);
            } else {
                zeroList.add(i);
            }
        }

        if (zeroList.size() > oneList.size()) {
            int v = findMissingNumber(oneList, column+1, size);
            return (v << 1) | 1;
        } else {
            int v = findMissingNumber(zeroList, column+1, size);
            return (v << 1);
        }
    }

    public static int findMissing(ArrayList<Integer> input, int n) {
        int size = 0;
        while (n > 0) {
            size ++;
            n >>= 1;
        }

        return findMissingNumber(input, 0, size);
    }
}
