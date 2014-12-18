package me.exercise;

/**
 * Created by Chase_Zhang on 12/17/14.
 */
public class Ex7 {
    public static final String[] digits = {
            "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
    };
    public static final String[] teens = {
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen"
    };
    public static final String[] tens = {
            "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static final String[] bigs = {
            "", " Thousand", " Million", " Billion"
    };

    public static String convertSmall(int num) {
        String res = "";
        if (num >= 100){
            res += digits[num/100 -1] + " Hundred";
            num %= 100;
        }

        if (num > 20 || num == 10) {
            res += " " + tens[num / 10 - 1];
            num %= 10;
        }
        else if (num > 10) {
            res += " " + teens[num - 11];
            num = 0;
        }

        if (num > 0) {
            res += " " + digits[num - 1];
        }
        return res.trim();
    }

    public static String numToString(int num) {
        if (num == 0) {
            return "Zero";
        }

        String sign = "";

        if (num < 0) {
            sign = "Negative ";
            num = -num;
        }

        String numString = "";
        int bigIdx = 0;
        while (num > 0) {
            int toCov = num % 1000;
            if (toCov != 0) {
                numString = " " + convertSmall(toCov) + bigs[bigIdx] + numString;
            }
            num /= 1000;
            bigIdx++;
            if (bigIdx >= bigs.length) break;
        }
        return (sign + numString.trim());
    }
}
