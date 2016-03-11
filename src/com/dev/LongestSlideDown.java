package com.dev;

import java.util.Arrays;

/**
 * Created by john-orr on 11/03/16.
 */
public class LongestSlideDown {

    public static int longestSlideDown(int[][] pyramid) {
        for (int i = pyramid.length - 2; i >= 0; i--) {
            for (int j = 0; j < pyramid[i].length; j++) {
                pyramid[i][j] += Math.max(pyramid[i + 1][j], pyramid[i + 1][j + 1]);
            }
        }
        for (int[] level : pyramid) {
            //System.out.println(Arrays.toString(level));
        }
        return pyramid[0][0];
    }
}
