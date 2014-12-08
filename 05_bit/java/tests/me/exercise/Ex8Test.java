package me.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex8Test {

    @Test
    public void testDrawHorizontalLine() throws Exception {
        int width = 10;
        int height = 10;
        byte[] screen = new byte[width * height];
        int x1 = 8 * 3 + 3;
        int x2 = 8 * 5;
        Ex8.drawHorizontalLine(screen, 10, x1, x2, 1);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                System.out.format("%02x ", screen[y * width + x]);
            }
            System.out.print('\n');
        }

        for (int i = x1; i <= x2; i++) {
            int pos = i + 8 * width * 1;
            int bytePos = pos / 8;
            int offset = 7 - (pos % 8);

            assertTrue((screen[bytePos] & (1 << offset)) > 0);
        }
    }
}