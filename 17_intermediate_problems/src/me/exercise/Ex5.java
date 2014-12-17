package me.exercise;

/**
 * Created by chase on 14-12-17.
 */
public class Ex5 {
    public final static int R = 1;
    public final static int Y = (1 << 1);
    public final static int G = (1 << 2);
    public final static int B = (1 << 3);

    public static class Result {
        int bingo = 0;
        int fakeBingo = 0;

        public Result(int bingo, int fakeBingo) {
            this.bingo = bingo;
            this.fakeBingo = fakeBingo;
        }
    }

    public static Result countBingo(int[] real, int[] guess) {
        int bingo = 0;
        int fakeBingo = 0;
        int realMask = 0;
        int guessMask = 0;
        for (int i = 0; i < 4; i++) {
            realMask |= real[i];
            guessMask |= guess[i];
            if(real[i] == guess[i]) bingo++;
        }

        int intersect = realMask & guessMask;
        if ((intersect & R) > 0) fakeBingo++;
        if ((intersect & Y) > 0) fakeBingo++;
        if ((intersect & G) > 0) fakeBingo++;
        if ((intersect & B) > 0) fakeBingo++;

        return new Result(bingo, fakeBingo - bingo);
    }
}
