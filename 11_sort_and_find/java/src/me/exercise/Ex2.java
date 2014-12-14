package me.exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * Created by Chase_Zhang on 12/12/14.
 */
public class Ex2 {
    // sort anagram

    public static String sorted(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }

    private static class SortComparator implements Comparator<String>{


        public int compare(String a, String b) {
            String sortedA = sorted(a);
            String sortedB = sorted(b);
            return sortedA.compareTo(sortedB);
        }

    }

    public static void sortByComparator(String[] strings) {
        Arrays.sort(strings, new SortComparator());
    }

    public static void sortByHashMap(String[] strings) {
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

        for (int i = 0; i < strings.length; i++) {
            String origin = strings[i];
            String sorted = sorted(origin);

            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<String>());
            }

            map.get(sorted).add(origin);
        }

        int index = 0;
        for (String key : map.keySet()) {
            ArrayList<String> list = map.get(key);
            for (String string : list) {
                strings[index] = string;
                index++;
            }
        }
    }
}
