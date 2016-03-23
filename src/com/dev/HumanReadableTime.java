package com.dev;

/**
 * Created by john-orr on 23/03/16.
 */
public class HumanReadableTime {
    public static String makeReadable(int seconds) {

        return String.format("%02d", seconds / 3600) + ":" + String.format("%02d", (seconds / 60) % 60) + ":" + String
                .format("%02d", seconds % 60);
    }
}
