package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex2Test {

    @Test
    public void testWinGameArray() throws Exception {
        short[][] noWin = {{0, 0, 1}, {1, 0, -1}, {0, 1, -1}};
        short[][] aWin = {{0, 0, 1}, {0, -1, 1}, {-1, 0, 1}};
        short[][] bWin = {{1, 1, -1}, {0, -1, 1}, {-1, 1, 1}};

        assertFalse(Ex2.winGameArray(noWin));
        assertTrue(Ex2.winGameArray(aWin));
        assertTrue(Ex2.winGameArray(bWin));
    }

    @Test
    public void testWinGameBit() throws Exception {
        int noWin1 = 0b001100010; int noWin2 = 0b000001001;
        int aWin1 = 0b001001001; int aWin2 = 0b000010100;
        int bWin1 = 0b110001011; int bWin2 = 0b001010100;
        assertFalse(Ex2.winGameBit(noWin1, noWin2));
        assertTrue(Ex2.winGameBit(aWin1, aWin2));
        assertTrue(Ex2.winGameBit(bWin1, bWin2));
    }

    @Test(expected = Exception.class)
    public void testWindGameBitException() throws Exception {
        int invalid1 = 0b110001011; int invalid2 = 0b001010001;
        Ex2.winGameBit(invalid1, invalid2);
    }
}