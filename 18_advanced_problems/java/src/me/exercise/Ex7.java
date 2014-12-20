package me.exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

/**
 * Created by Chase_Zhang on 12/20/14.
 */
public class Ex7 {
    private static class LengthComparator implements Comparator<String> {

        public int compare(String a, String b) {
            return b.length() - a.length();
        }
    }

    private static boolean canBuildWord(String word, boolean isOriginWord, HashMap<String, Boolean> map) {
        if (!isOriginWord && map.containsKey(word)) {
            return map.get(word);
        }

        for (int i = 1; i < word.length() - 1; i++) {
            String left = word.substring(0, i);
            String right = word.substring(i);

            if (map.containsKey(left) && map.get(left) == true && canBuildWord(right, false, map)) {
                map.put(word, true);
                return true;
            }
        }

        map.put(word, false);
        return false;
    }

    public static String getLongestWord(String[] words) {
        HashMap<String, Boolean> map = new HashMap<String, Boolean>(words.length);
        for (String word : words) {
            map.put(word, true);
        }
        Arrays.sort(words, new LengthComparator());
        for (String word : words) {
            if (canBuildWord(word, true, map)) return word;
        }
        return "";
    }
}
