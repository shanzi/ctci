package me.exercise;

/**
 * Created by chase on 14-12-17.
 */
public class Ex3 {
    public static int countOfZero(int num) {
        int count = 0;
        for (int i = 5; i <= num; i++) {
            int j = i;
            while(j > 0 && j % 5 == 0) {
                count++;
                j = j / 5;
            }
        }
        return count;
    }
}
