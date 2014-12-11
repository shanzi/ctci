package me.exercise;

import java.math.BigInteger;

/**
 * Created by Chase_Zhang on 12/10/14.
 */
public class Ex2 {
    // number of ways for a robot to go

    public static int numberOfWays(int X, int Y) {
        BigInteger res = new BigInteger("1");
        for (int i = X+1; i <= X + Y; i++) {
            res = res.multiply(new BigInteger(String.valueOf(i)));
        }
        for (int i = 2; i <= Y; i++) {
            res = res.divide(new BigInteger(String.valueOf(i)));
        }
        return res.intValue();
    }
}
