package me.exercise;

/**
 * Created by Chase_Zhang on 12/10/14.
 */
public class Ex3 {
    // find magic index

    public static int findMagicIndexByIteration(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers[i]) return i;
        }
        return -1;
    }

    public static int findMagicIndexWithoutDuplicated(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            if (mid == numbers[mid]) return mid;
            else if (mid > numbers[mid]) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }

    public static int findMagicIndexWithDuplicated(int [] numbers, int left, int right) {
        if (left > right) return -1;

        int mid = (left + right) / 2;
        if (mid == numbers[mid]) return mid;
        else if (mid > numbers[mid]) {
            int leftRes = findMagicIndexWithDuplicated(numbers, left, numbers[mid]);
            int rightRes = findMagicIndexWithDuplicated(numbers, mid+1, right);
            if (leftRes > 0) return  leftRes;
            else return rightRes;
        } else {
            int leftRes = findMagicIndexWithDuplicated(numbers, left, mid-1);
            int rightRes = findMagicIndexWithDuplicated(numbers, numbers[mid], right);
            if (left > 0) return leftRes;
            else return rightRes;
        }
    }

    public static int findMagicIndexWithDuplicated(int [] numbers) {
        return findMagicIndexWithDuplicated(numbers, 0, numbers.length-1);
    }
}
