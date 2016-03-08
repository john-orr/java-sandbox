package com.dev;

/**
 * Created by john-orr on 08/03/16.
 */
public class CalculateRotation {
    static int shiftedDiff(String first, String second) {
        if (first.length() == second.length()) {
            return (second + second).indexOf(first);
        }
        return -1;
    }
}
