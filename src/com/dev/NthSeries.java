package com.dev;

/**
 * Created by john-orr on 04/04/16.
 */
public class NthSeries {

    public static String seriesSum(int n) {
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += 1.0 / (3 * i + 1);
        }
        return String.format("%.2f", sum);
    }
}
