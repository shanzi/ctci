package me.exercise;

/**
 * Created by Chase_Zhang on 12/8/14.
 */
public class Ex3 {
    // get next and previous value with same number of 1

    public static int getNext(int num) {
        if (num == 0) return -1;

        int c = 1;
        int c0 = 0;
        int c1 = 0;

        while ((num & c) == 0) {
            c0++;
            c <<= 1;
        }

        while ((num & c) != 0) {
            c1++;
            c <<= 1;
        }

        if (c0 + c1 >= 31) return -1;

        return num + (1 << c0) + (1<< (c1 - 1)) - 1;
    }

    public static int getPrev(int num) {
        if (num == 0) return -1;

        int c = 1;
        int c0 = 0;
        int c1 = 0;

        while ((num & c) !=0) {
            c1++;
            c <<= 1;
        }

        while ((num & c) == 0 && c != 0) {
            c0 ++;
            c <<= 1;
        }

        if (c0 + c1 >= 31) return -1;

        return num - (1 << c1) - (1 << (c0 - 1)) + 1;
    }
}
