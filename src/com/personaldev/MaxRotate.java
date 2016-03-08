package com.personaldev;

/**
 * Created by john-orr on 04/03/16.
 */
public class MaxRotate {

    public static long maxRot(long n) {
        String prev = String.valueOf(n);
        int numLength = prev.length();
        long max = n;
        for (int i = 0; i < numLength - 1; i++) {
            String curr = rotateSub(prev, i);
            max = Math.max(max, Long.valueOf(curr));
            prev = curr;
        }
        return max;
    }

    private static String rotateSub(String s, int numCharsToFix) {
        return s.substring(0, numCharsToFix) + rotate(s.substring(numCharsToFix));
    }

    private static String rotate(String s) {
        return s.substring(1) + s.charAt(0);
    }
}