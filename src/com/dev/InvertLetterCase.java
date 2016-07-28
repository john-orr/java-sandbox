package com.dev;

/**
 * Created by john-orr on 25/07/16.
 */
public class InvertLetterCase {

    public static String invert(String input) {
        char[] chars = input.toCharArray();
        StringBuilder output = new StringBuilder();
        for (char character : chars) {
            if (Character.isUpperCase(character)) {
                output.append(Character.toLowerCase(character));
            } else if (Character.isLowerCase(character)) {
                output.append(Character.toUpperCase(character));
            } else {
                output.append(character);
            }
        }
        return output.toString();
    }
}
