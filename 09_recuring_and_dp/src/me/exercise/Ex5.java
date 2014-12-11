package me.exercise;


import java.util.ArrayList;

/**
 * Created by Chase_Zhang on 12/11/14.
 */
public class Ex5 {
    // all combinations of a string
    private static String insertCharAt(String str, char ch, int index) {
        String start = str.substring(0, index);
        String end = str.substring(index);
        return start + ch + end;
    }

    public static ArrayList<String> allCombinationsOfStringNonDuplicated(String string) {
        if (string.length()<=1) {
            ArrayList<String> comb = new ArrayList<String>();
            comb.add(string);
            return comb;
        } else {
            char ch = string.charAt(0);
            String subString = string.substring(1);
            ArrayList<String> combins = allCombinationsOfStringNonDuplicated(subString);
            ArrayList<String> newCombins = new ArrayList<String>();

            for (String str : combins) {
                for (int i = 0; i <= str.length(); i++) {
                    newCombins.add(insertCharAt(str, ch, i));
                }
            }

            return newCombins;
        }
    }
}
