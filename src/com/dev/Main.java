package com.dev;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Regex.commitMessageChecks("a into b. b into c.");

        System.out.println(Kata.evaporator(10, 10, 10));

        System.out.println(Kata.replaceVowels("johnorr123@gmail.cOm"));
        System.out.println(Kata.vowel2Index("johnorr123@gmail.cOm"));

        System.out.println(Kata.isValid("1j"));

        System.out.println(PlayPass.playPass("zZ BORN IN 1992!", 5));
        System.out.println(PlayPass.playPass("BORN IN 2015!", 1));

        System.out.println(MaxRotate.maxRot(6000200239l));

        System.out.println("Rotation:" + CalculateRotation.shiftedDiff("isn't", "'tisn"));

        System.out.println(StringMerger.isMerge("Bananas from Bahamas", "Bahas", "Bananas from am"));
        System.out.println(StringMerger.isMerge("codewars", "code", "code"));

        String[] friends1 = new String[] { "A1", "A2", "A3", "A4", "A5" };
        String[][] fTowns1 = { new String[] {"A1", "X1"}, new String[] {"A2", "X2"}, new String[] {"A3", "X3"},
                               new String[] {"A4", "X4"} };
        Map<String, Double> distTable1 = new HashMap<String, Double>();
        distTable1.put("X1", 100.0); distTable1.put("X2", 200.0); distTable1.put("X3", 250.0);
        distTable1.put("X4", 300.0);
        System.out.println(Tour.tour(friends1, fTowns1, distTable1));

        System.out.println(RomanNumeral.generate(1989));
        System.out.println(RomanNumeral.generate(2474));
    }
}