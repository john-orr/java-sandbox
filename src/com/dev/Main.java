package com.dev;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Regex.commitMessageChecks("a into b. b into c.");

        Kata.evaporator(10, 10, 10);

        Kata.replaceVowels("johnorr123@gmail.cOm");
        Kata.vowel2Index("johnorr123@gmail.cOm");

        Kata.isValid("1j");

        PlayPass.playPass("zZ BORN IN 1992!", 5);
        PlayPass.playPass("BORN IN 2015!", 1);

        MaxRotate.maxRot(6000200239l);

        CalculateRotation.shiftedDiff("isn't", "'tisn");

        StringMerger.isMerge("Bananas from Bahamas", "Bahas", "Bananas from am");
        StringMerger.isMerge("codewars", "code", "code");

        String[] friends1 = new String[]{"A1", "A2", "A3", "A4", "A5"};
        String[][] fTowns1 = {new String[]{"A1", "X1"}, new String[]{"A2", "X2"}, new String[]{"A3", "X3"},
                              new String[]{"A4", "X4"}};
        Map<String, Double> distTable1 = new HashMap<String, Double>();
        distTable1.put("X1", 100.0);
        distTable1.put("X2", 200.0);
        distTable1.put("X3", 250.0);
        distTable1.put("X4", 300.0);
        Tour.tour(friends1, fTowns1, distTable1);

        Scramblies.scramble("scriptingjava", "javascript");

        Josephus.josephusPermutation(new ArrayList(Arrays.asList(new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})), 2);

        BraceChecker.isValid("[}]");

        int[][] pyramid = new int[][]{{75},
                                   {95, 64},
                                   {17, 47, 82},
                                   {18, 35, 87, 10},
                                   {20, 4, 82, 47, 65},
                                   {19, 1, 23, 75, 3, 34},
                                   {88, 2, 77, 73, 7, 63, 67},
                                   {99, 65, 4, 28, 6, 16, 70, 92},
                                   {41, 41, 26, 56, 83, 40, 80, 70, 33},
                                   {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
                                   {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
                                   {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
                                   {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
                                   {63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
                                   {4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23},
        };
        System.out.println(LongestSlideDown.longestSlideDown(pyramid));
    }
}