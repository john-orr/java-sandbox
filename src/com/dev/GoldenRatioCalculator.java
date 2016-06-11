package com.dev;

public class GoldenRatioCalculator {

    private static double REQUIRED_PRECISION;

    public static double calculate(double precision) {
        REQUIRED_PRECISION = precision;
        return goldenRatio(1, 1);
    }

    private static double goldenRatio(int a, int b) {
        double prevRatio = (double) b / a;
        int c = a + b;
        double ratio = (double) c / b;
        double delta = Math.abs(ratio - prevRatio);
        if (delta < REQUIRED_PRECISION) {
            System.out.println(String.format(
                    "%d/%d is an adequate representation for the golden ratio in this case.", c,
                    b));
            return ratio;
        } else {
            return goldenRatio(b, c);
        }
    }
}