package me.exercise;

import java.util.*;

/**
 * Created by chase on 14-12-21.
 */
public class Ex10 {
    private static HashSet<String> getNextWord(String word) {
        HashSet<String> words = new HashSet<String>();
        for (int i = 0; i < word.length(); i++) {
            char[] wordChars = word.toCharArray();
            for (char c = 'a'; c <= 'z'; c++) {
                if (word.charAt(i) != c) {
                    wordChars[i] = c;
                    words.add(String.valueOf(wordChars));
                }
            }
        }
        return words;
    }
    public static LinkedList<String> transform(String fromWord, String toWord, HashSet<String> dictionary) {
        HashSet<String> visited = new HashSet<String>();
        HashMap<String, String> backTrack = new HashMap<String, String>();
        LinkedList<String> actionQueue = new LinkedList<String>();

        fromWord = fromWord.toLowerCase();
        toWord = toWord.toLowerCase();

        actionQueue.add(fromWord);
        visited.add(fromWord);
        while (!actionQueue.isEmpty()) {
            String word = actionQueue.pollFirst();
            for (String nextWord : getNextWord(word)) {
                if (nextWord.equals(toWord)) {
                    backTrack.put(toWord, word);
                    LinkedList<String> res = new LinkedList<String>();
                    String currentWord = toWord;
                    while (!currentWord.equals(fromWord)) {
                        res.addFirst(currentWord);
                        currentWord = backTrack.get(currentWord);
                    }
                    res.addFirst(fromWord);
                    return res;
                }

                if (dictionary.contains(nextWord)) {
                    if (!visited.contains(nextWord)) {
                        actionQueue.add(nextWord);
                        backTrack.put(nextWord, word);
                        visited.add(nextWord);
                    }
                }
            }
        }
        return null;
    }
}
