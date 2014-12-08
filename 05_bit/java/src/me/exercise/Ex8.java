package me.exercise;

/**
 * Created by Chase_Zhang on 12/8/14.
 */
public class Ex8 {
    // draw line on binary screen

    public static void drawHorizontalLine(byte[] screen, int width, int x1, int x2, int y) {
        int start = (y * width * 8 + x1);
        int end = (y * width * 8 + x2);
        int startByte = start / 8;
        int endByte = end / 8;
        int startOffset = start % 8;
        int endOffset = end % 8;

        byte startMask = (byte) (0xFF >> startOffset);
        byte endMask = (byte) ~(0xFF >> (endOffset + 1));

        if (startByte == endByte) {
            screen[startByte] |= (startMask & endMask);
        } else {
            screen[startByte] |= startMask;
            screen[endByte] |= endMask;

            for (int i = startByte + 1; i < endByte; i++) {
                screen[i] = (byte)0xFF;
            }
        }
    }
}
