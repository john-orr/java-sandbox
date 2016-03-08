package com.dev;

/**
 * Created by john-orr on 08/03/16.
 */
public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
        if (s.isEmpty()) {
            return part1.isEmpty() && part2.isEmpty();
        }
        char c = s.charAt(0);
        if (!part1.isEmpty() && c == part1.charAt(0))
            if (isMerge(s.substring(1), part1.substring(1), part2))
                return true;
        if (!part2.isEmpty() && c == part2.charAt(0))
            return isMerge(s.substring(1), part1, part2.substring(1));
        return false;
    }
}
