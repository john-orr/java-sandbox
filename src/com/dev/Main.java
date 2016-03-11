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
    }
}