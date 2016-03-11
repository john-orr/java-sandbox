package com.dev;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by john-orr on 11/03/16.
 */
public class BraceChecker {

    public static boolean isValid(String braces) {
        List<Character> openedBraces = new ArrayList<>();
        for (char c : braces.toCharArray()) {
            if (isOpeningBrace(c)) {
                openedBraces.add(c);
            } else if (!openedBraces.isEmpty() && isClosingBraceOf(c, openedBraces.get(openedBraces.size() - 1))) {
                openedBraces.remove(openedBraces.size() - 1);
            } else {
                return false;
            }
        }
        return openedBraces.isEmpty();
    }

    private static boolean isClosingBraceOf(char c, char openingCharacter) {
        return openingCharacter == '(' && c == ')' || openingCharacter == '{' && c == '}' || openingCharacter == '[' && c == ']';
    }

    private static boolean isOpeningBrace(char c) {
        return c == '(' || c == '{' || c == '[';
    }

}
