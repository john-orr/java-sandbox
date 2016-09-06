package com.dev;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by john-orr on 06/04/16.
 */
public class RegExp {

    public static boolean isHexNumber(String s) {
        return s.matches("(0[xX])?[a-fA-F\\d]+");
    }

    public static boolean isVowel(String s) {
        return s.matches("[aeiou]");
    }

    public static boolean isDigit(String s) {
        return s.matches("\\d");
    }

    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4],
                numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
    }

    public static Pattern multipleOf3() {
        // Regular expression that matches binary inputs that are multiple of 3
        return Pattern.compile("");
    }

    public static boolean isValid(String idn) {
        String pattern = "^[a-zA-z_$][a-zA-Z0-9_$]*";
        return idn.matches(pattern);
    }

    public static String bucketOf(String said) {
        System.out.println(said);

        boolean water = Pattern.compile("water|wet|wash", Pattern.CASE_INSENSITIVE).matcher(said).find();
        boolean slime = Pattern.compile("i don't know|slime", Pattern.CASE_INSENSITIVE).matcher(said).find();

        if (water && slime) {
            return "sludge";
        } else if (water) {
            return "water";
        } else if (slime) {
            return "slime";
        } else {
            return "air";
        }
    }

    public static String ghostBusters(String building) {
        if (building.matches("\\w+")) {
            return "You just wanted my autograph didn't you?";
        } else {
            return building.replaceAll("\\s", "");
        }
    }

    /**
     * Returns the index of the first occurrence of the word "Wally". "Wally" must not be part of another word or
     * directly preceded by a punctuation mark, but it can be directly followed by a punctuation mark. If no such
     * "Wally" exists, returns -1.
     *
     * @param str The string to search
     * @return index described above
     */
    public static int wheresWally(String str) {
        Matcher matcher = Pattern.compile("(?<![\\S])Wally\\b").matcher(str);
        if (matcher.find()) {
            return matcher.start();
        }
        return -1;
    }

    public static int[] getPasswordPositions(String instructions) {
        Matcher matcher = Pattern.compile("(\\d{1,2}).+?(\\d{1,2}).+?(\\d{1,2})").matcher(instructions);
        int[] positions = new int[3];
        if (matcher.find()) {
            positions[0] = Integer.valueOf(matcher.group(1));
            positions[1] = Integer.valueOf(matcher.group(2));
            positions[2] = Integer.valueOf(matcher.group(3));
        }
        return positions;
    }
}
