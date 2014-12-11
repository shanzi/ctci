package me.exercise;

import java.util.ArrayList;

/**
 * Created by Chase_Zhang on 12/11/14.
 */
public class Ex6 {
    // permutations of ( and )

    private static ArrayList<String> generateParens(int left, int right) {
        ArrayList<String> parens = new ArrayList<String>();

        if (left == 0 && right == 0) {
            parens.add("");
            return parens;
        }

        if (left > 0) {
            ArrayList<String> subparens = generateParens(left - 1, right);
            for (String pars : subparens) {
                parens.add("(" + pars);
            }
        }

        if (right > left){
            ArrayList<String> subparens = generateParens(left, right - 1);
            for (String pars : subparens) {
                parens.add(")" + pars);
            }
        }

        return parens;
    }

    public static ArrayList<String> generateParens(int numOfPairs) {
        return generateParens(numOfPairs, numOfPairs);
    }

    public static void addParens(ArrayList<String> list, int left, int right, char[] str, int count) {
        if (left == 0 && right == 0) {
            list.add(String.copyValueOf(str));
        } else {
            if (left > 0) {
                str[count] = '(';
                addParens(list, left - 1, right, str, count + 1);
            }
            if (right > left) {
                str[count] = ')';
                addParens(list, left, right - 1, str, count + 1);
            }
        }
    }

    public static ArrayList<String> genParens(int count) {
        ArrayList<String> list = new ArrayList<String>();
        char[] str = new char[count*2];
        addParens(list, count, count, str, 0);
        return list;
    }
}
