package com.dev;

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
    }
}