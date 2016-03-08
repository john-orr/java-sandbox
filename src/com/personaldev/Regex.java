package com.personaldev;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by john-orr on 04/03/16.
 */
public class Regex {

    public static void commitMessageChecks(String message) {
        String regex = "\\w into \\w\\.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println(matcher.group());
        }
        System.out.println("Found " + count + " match" + ((count == 1) ? "" : "es"));
    }
}
