package com.dev;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by john-orr on 04/03/16.
 */
public class Kata {

    public static int evaporator(double content, double evap_per_day, double threshold) {
        int day = 1;
        while (100*Math.pow(1-evap_per_day/100, day) > threshold) day++;
        return day;
    }

    public static String replaceVowels(String input) {
        StringBuilder output = new StringBuilder();
        Matcher vowelMatcher = Pattern.compile("[aeiouAEIOU]").matcher(input);
        int lastMatch = 0;
        while (vowelMatcher.find()) {
            output.append(input.substring(lastMatch, vowelMatcher.start())).append(vowelMatcher.start());
            lastMatch = vowelMatcher.start() + 1;
        }
        return output.append(input.substring(lastMatch)).toString();
    }

    public static String vowel2Index(String s) {
        StringBuilder output = new StringBuilder();
        int i = 0;
        int lastMatch = 0;
        for (; i<s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                output.append(s.substring(lastMatch, i)).append(i+1);
                lastMatch = i + 1;
            }
        }
        return output.append(s.substring(lastMatch)).toString();
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
