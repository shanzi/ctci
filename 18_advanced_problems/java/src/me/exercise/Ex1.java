package me.exercise;

/**
 * Created by chase on 14-12-18.
 */
public class Ex1 {

    public static int add(int a, int b) {
        while (true) {
            int sum = a ^ b;
            int carry = (a & b) << 1;

            if (carry == 0) return sum;
            a = sum;
            b = carry;
        }
    }
}
