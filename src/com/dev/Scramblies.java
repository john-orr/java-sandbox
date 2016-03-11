package com.dev;

/**
 * Created by john-orr on 09/03/16.
 */
public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        char[] chars = str2.toCharArray();
        for (char c : chars) {
            if (str1.contains(String.valueOf(c))) {
                str1 = str1.replaceFirst(String.valueOf(c), "");
            } else {
                return false;
            }
        }
        return true;
    }
}
