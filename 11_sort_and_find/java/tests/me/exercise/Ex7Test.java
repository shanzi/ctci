package me.exercise;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class Ex7Test {

    int[] makeSeq(int len){
        Random rand = new Random();
        int[] seq = new int[len];
        for (int i = 0; i < len; i++) {
            seq[i] = rand.nextInt(len);
        }
        return seq;
    }

    int rank(int[] seq, int value, int idx) {
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (seq[i] < value) count++;
        }
        return count;
    }

    @Test
    public void testGetRank() throws Exception {
        int[] seq = makeSeq(100);
        for (int i = 0; i < 100; i++) {
            Ex7.insertValue(seq[i]);

            for (int j = 0; j <= i; j++) {
                assertEquals(rank(seq, seq[j], i + 1), Ex7.getRank(seq[j]));
            }

            assertEquals(0, Ex7.getRank(-1));
            assertEquals(i + 1, Ex7.getRank(200));
        }
    }
}