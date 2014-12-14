package me.exercise;

/**
 * Created by Chase_Zhang on 12/14/14.
 */
public class Ex4 {
    // binary search with empty strings in;

    private static int search(String[] strings, String str, int first, int last){
        if (first > last) return -1;

        int mid = (first + last) / 2;
        int left = mid - 1;
        int right = mid + 1;

        while (strings[mid].isEmpty()) {
            if (left < first && right > first) {
                return -1;
            } else if(left >= first && !strings[left].isEmpty()) {
                mid = left;
                break;
            } else if(right <= last && !strings[right].isEmpty()) {
                mid = right;
                break;
            }
            left--;
            right++;
        }

        if (strings[mid].equals(str)) return mid;
        else if (strings[mid].compareTo(str) < 0) {
            return search(strings, str, mid+1, last);
        } else {
            return search(strings, str, first, mid-1);
        }
    }

    public static int search(String[] strings, String str) {
        if (strings == null || str == null || str.isEmpty()) return -1;
        return search(strings, str, 0, strings.length - 1);
    }
}
