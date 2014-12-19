package me.exercise;

import java.util.Random;

/**
 * Created by chase on 14-12-19.
 */
public class Ex2 {
    // shuffle cards
    static void suffleArray(int[] cards) {
        Random rand = new Random();
        for (int i = 1; i < cards.length; i++) {
            int k = rand.nextInt(i+1);

            int temp = cards[k];
            cards[k]=cards[i];
            cards[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] cards = new int[52];
        for (int i = 0; i < 52; i++) {
            cards[i] = i;
        }
        suffleArray(cards);
        for (int i = 0; i < 52; i++) {
            System.out.printf("%d ", cards[i]);
        }
        System.out.println();
    }
}
