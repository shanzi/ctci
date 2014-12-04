package me.exercise;

/**
 * Created by chase on 14-12-4.
 */
public class Ex1 {
    public boolean checkCharactersAllDifferent(String a) {
        // Assume the charset is ASCII
        if (a.length() > 256) return false;
        boolean[] charset = new boolean[256];
        for (int i = 0; i < a.length(); i++) {
            int val = a.charAt(i);
            if (charset[val]) return false;
            charset[val] = true;
        }
        return true;
    }

    public boolean checkCharactersAllDifferentBinary(String a) {
        // assume the charset is a-z
        if (a.length() > 26) return false;
        int charset_marker = 0;
        for (int i = 0; i < a.length(); i++) {
            int val = a.charAt(i);
            if ((charset_marker & (1 << val)) > 0) {
                return false;
            }
            charset_marker |= (1 << val);
        }
        return true;
    }

    public boolean checkCharactersAllDifferentNoOtherStructure(String a) {
        // Check if a string's characters are all different without other data structure
        // assume the charset is ASCII

        if (a.length() > 256) return false;
        for (int i = 0; i < a.length()-1; i++) {
            int val = a.charAt(i);
            for (int j = i+1; j < a.length(); j++) {
               if (val == a.charAt(j)) return false;
            }
        }
        return true;
    }
}
