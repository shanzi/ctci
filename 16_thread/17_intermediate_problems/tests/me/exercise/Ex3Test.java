package me.exercise;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class Ex3Test {

    int testZerosCount(int n) {
        BigInteger integer = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            integer = integer.multiply(new BigInteger(String.valueOf(i)));
        }
        String resString = integer.toString();
        char[] resArray = resString.toCharArray();
        int count = 0;
        for (int i = resArray.length - 1; i > 0; i--) {
            if (resArray[i] == '0') count++;
            else break;
        }
        return count;
    }

    @Test
    public void testCountOfZero() throws Exception {
        assertEquals(testZerosCount(2), Ex3.countOfZero(3));
        assertEquals(testZerosCount(5), Ex3.countOfZero(5));
        assertEquals(testZerosCount(11), Ex3.countOfZero(11));
        assertEquals(testZerosCount(17), Ex3.countOfZero(17));
        assertEquals(testZerosCount(25), Ex3.countOfZero(25));
        assertEquals(testZerosCount(27), Ex3.countOfZero(27));
    }
}