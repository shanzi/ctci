package me.exercise;

/**
 * Created by chase on 14-12-5.
 */
public class Ex8 {
    // check if string sis rotate

    private boolean isSubString(String sub, String string) {
        return string.contains(sub);
    }

    public boolean isStringFromRotate(String sub, String str) {
        if (sub.length() != str.length()) return false;
        String longStr = str + str;
        return isSubString(sub, longStr);
    }
}
