package com.dev;

/**
 * Created by YouthfulDrake on 10/03/2016.
 */
public class RomanNumeral {

    private static final String THOUSAND = "M";
    private static final String FIVE_HUNDRED = "D";
    private static final String HUNDRED = "C";
    private static final String FIFTY = "L";
    private static final String TEN = "X";
    private static final String FIVE = "V";
    private static final String ONE = "I";

    public static String generate(int n) {
        StringBuilder result = new StringBuilder();
        int thousands = n / 1000;
        for (int i = 0; i < thousands; i++) {
            result.append(THOUSAND);
        }
        n = n % 1000;
        result.append(generateNumerals(n/100, HUNDRED, FIVE_HUNDRED, THOUSAND));
        n = n % 100;
        result.append(generateNumerals(n/10, TEN, FIFTY, HUNDRED));
        n = n % 10;
        result.append(generateNumerals(n, ONE, FIVE, TEN));
        return result.toString();
    }

    private static String generateNumerals(int number, String unitRepresentation, String _5Units, String _10Units) {
        StringBuilder result = new StringBuilder();
        if (number == 9) {
            result.append(unitRepresentation).append(_10Units);
        } else if (number >= 5) {
            result.append(_5Units);
            for (int i = 5; i < number; i++) {
                result.append(unitRepresentation);
            }
        } else if (number == 4) {
            result.append(unitRepresentation).append(_5Units);
        } else {
            for (int i = 0; i < number; i++) {
                result.append(unitRepresentation);
            }
        }
        return result.toString();
    }
}
