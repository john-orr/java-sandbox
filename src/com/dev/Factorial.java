package com.dev;

/**
 * Created by john-orr on 04/04/16.
 */
public class Factorial {

    public static int factorial(int n) {
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException("Invalid value.");
        }
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
