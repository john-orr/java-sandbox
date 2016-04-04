package com.dev;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by john-orr on 04/04/16.
 */
public class FactorialZerosCounter {

    public static int zeros(int n) {

        String factorial = String.valueOf(factorial(n));
        Pattern pattern = Pattern.compile("0*$");
        Matcher matcher = pattern.matcher(factorial);
        matcher.find();
        return matcher.group().length();
    }

    private static BigInteger factorial(int n) {
        // Not using recursion to avoid StackOverflowError with very big numbers.
        BigInteger bigInteger = BigInteger.ONE;
        for (int i = n; i > 1; i--) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        return bigInteger;
    }
}
