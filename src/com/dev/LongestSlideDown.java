package com.dev;

/**
 * Created by john-orr on 11/03/16.
 */
public class LongestSlideDown {

    public static int longestSlideDown(int[][] pyramid) {
        return sumLongestPath(pyramid, 0, 0);
    }

    private static int sumLongestPath(int[][] pyramid, int level, int position) {
        if (level == pyramid.length - 1) {
            return pyramid[level][position];
        } else {
            int sumLeftPyramid = pyramid[level][position] + sumLongestPath(pyramid, level + 1, position);
            int sumRightPyramid = pyramid[level][position] + sumLongestPath(pyramid, level + 1, position + 1);
            return Math.max(sumLeftPyramid, sumRightPyramid);
        }
    }
}
