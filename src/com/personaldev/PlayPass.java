package com.personaldev;

/**
 * Created by john-orr on 04/03/16.
 */
public class PlayPass {
    public static String playPass(String s, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                if (i % 2 == 0) {
                    c = String.valueOf(c).toUpperCase().charAt(0);
                    if (c + n > 'Z') c += n - 26;
                    else c += n;
                } else {
                    c = String.valueOf(c).toLowerCase().charAt(0);
                    if (c + n > 'z') c += n - 26;
                    else c += n;
                }
                result.append(c);
            } else if (Character.isDigit(c)) result.append(9 - Integer.parseInt(String.valueOf(c)));
            else result.append(c);
        }
        return result.reverse().toString();
    }
}