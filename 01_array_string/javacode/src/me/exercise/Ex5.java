package me.exercise;

/**
 * Created by Chase_Zhang on 12/4/14.
 */
public class Ex5 {
    // compress strings

    public String compressStringWithStringBuffer(String str) {
        if (str == null || str.isEmpty()) return str;

        StringBuffer strBuff = new StringBuffer();

        int count = 1;
        char lastChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == lastChar) {
                count += 1;
            } else {
                strBuff.append(lastChar);
                strBuff.append(count);
                lastChar = ch;
                count = 1;
            }
        }

        strBuff.append(lastChar);
        strBuff.append(count);

        String compressedString = strBuff.toString();
        if (str.length() <= compressedString.length()) return str;
        return compressedString;
    }


    private int compressCount(String str) {
        if (str == null || str.isEmpty()) return 0;

        int compressedCount = 0;
        int count = 1;
        char lastChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == lastChar) {
                count +=1;
            } else {
                compressedCount += 1 + String.valueOf(count).length();
                count = 1;
                lastChar = ch;
            }
        }
        compressedCount += 1 + String.valueOf(count).length();

        return compressedCount;
    }

    private int setChars(char[] array, int index, char ch, int count) {
        array[index] = ch;

        index += 1;
        char[] countCharArray = String.valueOf(count).toCharArray();

        for (char c : countCharArray) {
            array[index] = c;
            index += 1;
        }
        return index;
    }

    public String compressStringWithCharArray(String str) {
        if (str == null || str.isEmpty()) return str;

        int compressedCount = compressCount(str);
        if (str.length() <= compressedCount) return str;

        char[] charArray = new char[compressedCount];

        int index = 0;
        int count = 1;
        char lastChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == lastChar) {
                count += 1;
            } else {
                index = setChars(charArray, index, lastChar, count);
                count = 1;
                lastChar = ch;
            }
        }

        setChars(charArray, index, lastChar, count);
        return new String(charArray);
    }
}
