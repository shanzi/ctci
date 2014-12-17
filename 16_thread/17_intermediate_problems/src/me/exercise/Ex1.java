package me.exercise;

/**
 * Created by chase on 14-12-17.
 */
public class Ex1 {
    public static class Result {
        int a;
        int b;

        public Result(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static Result swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new Result(a, b);
    }

    public static Result swapXOR(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return new Result(a, b);
    }
}
