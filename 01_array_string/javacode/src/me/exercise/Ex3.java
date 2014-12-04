package me.exercise;

/**
 * Created by chase on 14-12-4.
 */
public class Ex3 {
    // Check if a string can be transformed to another string by sort

    private String sortString(String str) {
        char[] charsArray = str.toCharArray();
        java.util.Arrays.sort(charsArray);
        return new String(charsArray);
    }

    public boolean checkAnagramBySort(String a, String b) {
        if (a.length() != b.length()) return false;
        return sortString(a).equals(sortString(b));
    }

    public boolean checkAnagramByCountChars(String a, String b) {
        // Assume the charset is ASCII
        if (a.length() != b.length()) return false;

        int[] charsCount = new int[256];
        for (int i = 0; i < a.length(); i++) {
            charsCount[a.charAt(i)] += 1;
        }

        for (int i = 0; i < b.length(); i++) {
            if ((--charsCount[b.charAt(i)]) < 0) return false;
        }

        return true;
    }
}
