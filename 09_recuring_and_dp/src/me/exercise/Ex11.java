package me.exercise;

/**
 * Created by Chase_Zhang on 12/11/14.
 */
public class Ex11 {
    // ways to make expression the same as result

    private static int waysOfExpression(String exp, boolean result, int start, int end) {
        if (start == end) {
            if ((exp.charAt(start) == '1') == result) return 1;
            else return 0;
        }

        int sum = 0;

        if (result) {
            for (int i = start; i <= end; i++) {
                char ch = exp.charAt(i);
                if (ch == '&') {
                    sum += waysOfExpression(exp, true, start, i - 1) * waysOfExpression(exp, true, i + 1, end);
                } else if (ch == '|') {
                    sum += waysOfExpression(exp, true, start, i - 1) * waysOfExpression(exp, true, i + 1, end);
                    sum += waysOfExpression(exp, true, start, i - 1) * waysOfExpression(exp, false, i + 1, end);
                    sum += waysOfExpression(exp, false, start, i - 1) * waysOfExpression(exp, true, i + 1, end);
                } else if (ch == '^') {
                    sum += waysOfExpression(exp, true, start, i - 1) * waysOfExpression(exp, false, i + 1, end);
                    sum += waysOfExpression(exp, false, start, i - 1) * waysOfExpression(exp, true, i + 1, end);
                } else continue;
            }
        } else {
            for (int i = start; i <= end; i++) {
                char ch = exp.charAt(i);
                if (ch == '&') {
                    sum += waysOfExpression(exp, true, start, i - 1) * waysOfExpression(exp, false, i + 1, end);
                    sum += waysOfExpression(exp, false, start, i - 1) * waysOfExpression(exp, true, i + 1, end);
                    sum += waysOfExpression(exp, false, start, i - 1) * waysOfExpression(exp, false, i + 1, end);
                } else if (ch == '|') {
                    sum += waysOfExpression(exp, false, start, i - 1) * waysOfExpression(exp, false, i + 1, end);
                } else if (ch == '^') {
                    sum += waysOfExpression(exp, true, start, i - 1) * waysOfExpression(exp, true, i + 1, end);
                    sum += waysOfExpression(exp, false, start, i - 1) * waysOfExpression(exp, false, i + 1, end);
                } else continue;
            }
        }

        return sum;
    }

    public static int waysOfExpression(String exp, boolean result){
        return waysOfExpression(exp, result, 0, exp.length() - 1);
    }
}
