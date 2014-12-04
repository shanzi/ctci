package me.exercise;

public class Ex4 {
    // replace all spaces in a string with "%20"

    public String escapeSpaceByCharArray(String str) {
        int spacesCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') spacesCount+=1;
        }
        int outputLength = str.length() + spacesCount * 2;
        char[] newStrChars = new char[outputLength];
        for (int i = str.length() -1 ; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                newStrChars[outputLength - 1] = '0';
                newStrChars[outputLength - 2] = '2';
                newStrChars[outputLength - 3] = '%';
                outputLength -= 3;
            } else {
                newStrChars[outputLength - 1] = str.charAt(i);
                outputLength -= 1;
            }
        }
        return new String(newStrChars);
    }

    public String escapeSpaceByStringBuffer(String str) {
        StringBuffer strBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                strBuffer.append("%20");
            } else {
                strBuffer.append(str.charAt(i));
            }
        }
        return strBuffer.toString();
    }

    public String escapeSpaceByReplace(String str) {
        return str.replaceAll(" ", "%20");
    }
}
