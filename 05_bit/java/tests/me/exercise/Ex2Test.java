package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex2Test {

    @Test
    public void testDoubleToBinary() throws Exception {
        double num1 = 0.125;
        String binary1 = ".001";

        assertEquals(Ex2.doubleToBinary(num1), binary1);

        double num2 = 0b0101011101011001 / ((double)(1<<16));
        String binary2 = ".0101011101011001";

        assertEquals(Ex2.doubleToBinary(num2), binary2);

        double num3 = 0.3;
        String binary3 = "ERROR";
        assertEquals(Ex2.doubleToBinary(num3), binary3);
    }
}