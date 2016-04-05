package com.dev;

import java.util.Arrays;

/**
 * Created by john-orr on 05/04/16.
 */
public class Xbonacci {

    public static double[] xbonacci(double[] signature, int n) {

        int x = signature.length;
        double[] sequence = Arrays.copyOf(signature, n);
        for (int i = x; i < n; i++) {
            double sum = 0.0;
            for (int j = i - x; j < i; j++) {
                sum += sequence[j];
            }
            sequence[i] = sum;
        }
        return sequence;
    }
}
