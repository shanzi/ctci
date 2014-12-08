package me.exercise;

/**
 * Created by Chase_Zhang on 12/8/14.
 */
public class Ex2 {
    // double to binary

    public static String doubleToBinary(double num) {
        if (num<=0 || num >=1) return "ERROR";

        StringBuilder binary = new StringBuilder();
        binary.append('.');

        while (num > 0) {
            if (binary.length() > 32) {
                return "ERROR";
            }

            num *= 2;
            if (num >= 1) {
                binary.append('1');
                num -= 1;
            } else {
                binary.append('0');
            }
        }

        return binary.toString();
    }
}
