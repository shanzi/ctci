package me.exercise;

import java.util.HashSet;
import java.util.Hashtable;

/**
 * Created by chase on 14-12-18.
 */
public class Ex14 {
    public static class CutWordResult {
        public int invalid = Integer.MAX_VALUE;
        public String bestString = "";

        public CutWordResult(int invalid, String bestString) {
            this.invalid = invalid;
            this.bestString = bestString;
        }

        public CutWordResult clone() {
            return new CutWordResult(invalid, bestString);
        }

        public static CutWordResult min(CutWordResult r1, CutWordResult r2) {
            if (r1 == null) return r2;
            else if (r2 == null) return r1;

            return r2.invalid > r1.invalid ? r1 : r2;
        }
    }

    private static CutWordResult parse(String string, HashSet<String> dictionary, int start, int end, Hashtable<Integer, CutWordResult>cache) {
        if (end >= string.length()) {
            return new CutWordResult(end-start, string.substring(start).toUpperCase());
        }

        if (cache.containsKey(start)) return cache.get(start).clone();

        String word = string.substring(start, end+1);
        CutWordResult bestExact = parse(string, dictionary, end+1, end+1, cache);
        if (dictionary.contains(word)) {
            if (bestExact.bestString.isEmpty()) bestExact.bestString = word;
            else bestExact.bestString = word + " " + bestExact.bestString;
        } else {
            bestExact.bestString = word.toUpperCase() + " " + bestExact.bestString;
            bestExact.invalid += word.length();
        }

        CutWordResult bestExtend = parse(string, dictionary, start, end+1, cache);

        CutWordResult best = CutWordResult.min(bestExact, bestExtend);
        cache.put(start, best.clone());
        return best;
    }

    public static CutWordResult parse(String string, HashSet<String> dictionary) {
        Hashtable<Integer, CutWordResult> cache = new Hashtable<>();
        return parse(string, dictionary, 0, 0, cache);
    }
}
