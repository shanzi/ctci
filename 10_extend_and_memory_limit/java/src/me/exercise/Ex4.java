package me.exercise;

import java.util.BitSet;
import java.util.HashSet;

/**
 * Created by Chase_Zhang on 12/12/14.
 */
public class Ex4 {
    public static HashSet<Integer> checkDuplicated(int[] array) {
        HashSet<Integer> duplicatedSet = new HashSet<Integer>();
        BitSet bs = new BitSet(32000);
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (bs.get(num - 1)) {
                duplicatedSet.add(num);
            } else {
                bs.set(num - 1);
            }
        }
        return duplicatedSet;
    }
}
