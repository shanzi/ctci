package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex8Test {

    @Test
    public void testMakeCharge() throws Exception {
        int[] chargeValues = {1, 5, 10,  25};

        for (int i = 0; i <= 100; i++) {
            assertEquals(makeChargeTest(i, 25), Ex8.makeCharge(chargeValues, i));
        }
    }

    int makeChargeTest(int n, int denom) {
        int next_denom = 0;
        switch (denom) {
            case 25:
                next_denom = 10;
                break;
            case 10:
                next_denom = 5;
                break;
            case 5:
                next_denom = 1;
                break;
            case 1:
                return 1;
        }

        int ways = 0;
        for (int i = 0; i * denom <= n; i++) {
            ways += makeChargeTest(n - i * denom, next_denom);
        }
        return ways;
    }
}