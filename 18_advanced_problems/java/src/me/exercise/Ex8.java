package me.exercise;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Chase_Zhang on 12/20/14.
 */
public class Ex8 {
    private static class SuffixTreeNode {
        char value;
        HashMap<Character, SuffixTreeNode> children = new HashMap<Character, SuffixTreeNode>();
        ArrayList<Integer> indexes = new ArrayList<Integer>();

        public void insertString(String str, int index) {
            indexes.add(index);
            if (str != null && str.length() > 0) {
                value = str.charAt(0);
                SuffixTreeNode child = null;
                if (children.containsKey(value)) {
                    child = children.get(value);
                } else {
                    child = new SuffixTreeNode();
                    children.put(value, child);
                }

                String remains = str.substring(1);
                child.insertString(remains, index);
            }
        }

        public ArrayList<Integer> search(String string) {
            if (string == null || string.length() == 0) {
                return indexes;
            } else {
                char first = string.charAt(0);
                if (children.containsKey(first)) {
                    return children.get(first).search(string.substring(1));
                }
            }
            return null;
        }
    }
    private static class SuffixTree {
        SuffixTreeNode root = new SuffixTreeNode();

        public SuffixTree(String s) {
            for (int i = 0; i < s.length(); i++) {
                String suffix = s.substring(i);
                root.insertString(suffix, i);
            }
        }

        public ArrayList<Integer> search(String subString) {
            return root.search(subString);
        }
    }

    public static ArrayList<Integer>[] search(String s, String[] t) {
        SuffixTree tree = new SuffixTree(s);
        ArrayList<Integer>[] res = new ArrayList[t.length];
        for (int i = 0; i < t.length; i++) {
            ArrayList<Integer> indexes = tree.search(t[i]);
            res[i] = indexes;
        }
        return res;
    }
}
