package com.dev;

/**
 * Created by john-orr on 21/03/16.
 */
public class CarMileage {

    public static int isInteresting(int number, int[] awesomePhrases) {
        if (interesting(number, awesomePhrases)) {
            return 2;
        }
        if (interesting(number + 1, awesomePhrases) || interesting(number + 2, awesomePhrases)) {
            return 1;
        }
        return 0;
    }

    private static boolean interesting(int number, int[] awesomePhrases) {

        if (number < 100) {
            return false;
        }
        // In predetermined list
        for (int i : awesomePhrases) {
            if (i == number) {
                return true;
            }
        }

        // Number followed by all 0s
        String stringVal = String.valueOf(number);
        if (stringVal.matches("^\\d0+$")) {
            return true;
        }

        // Number is a palindrome and same number repeated
        if (new StringBuilder(stringVal).reverse().toString().equals(stringVal)) {
            return true;
        }

        // Incrementing
        if ("0123456789".contains(stringVal)) {
            return true;
        }
        // Decrementing
        if ("9876543210".contains(stringVal)) {
            return true;
        }

        return false;
    }

}