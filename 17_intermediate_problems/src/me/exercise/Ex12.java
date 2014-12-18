package me.exercise;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Chase_Zhang on 12/17/14.
 */
public class Ex12 {

    public static class Tuple {
        int a;
        int b;

        public Tuple(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static LinkedList<Tuple> pairsSumsTo(int[] array, int sum) {
        Arrays.sort(array);
        LinkedList<Tuple> list = new LinkedList<>();
        int first = 0;
        int last = array.length - 1;

        while (first < last) {
            int pairSum = array[first] + array[last];
            if (pairSum == sum) {
                list.add(new Tuple(first, last));
                first++;
            }
            else if (pairSum > sum) last--;
            else first++;
        }
        return list;
    }
}
