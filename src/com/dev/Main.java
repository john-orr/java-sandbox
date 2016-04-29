package com.dev;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        System.out.println(WeightSort.orderWeight("103 123 4444 99 2000"));

        RegExp.ghostBusters("BusStation");

        Arrays.toString(Xbonacci.xbonacci(new double[]{1, 2, 3}, 10));

        NthSeries.seriesSum(3);

        FindOutlier.find(new int[]{2, 6, 8, 10, 3, 2, 6, 8, 200, 700, 1, 84, 10, 4, 17, 6, 8, 10, 6, 12, 24, 36});

        Pattern commitMessageRegex = Pattern.compile("\\w+ into \\w+\\.");
        Matcher matcher = commitMessageRegex.matcher("ab into bc. bc into cd.");
        while (matcher.find()) {
            //System.out.println(matcher.group());
        }

        Kata.evaporator(10, 10, 10);

        Kata.replaceVowels("johnorr123@gmail.cOm");
        Kata.vowel2Index("johnorr123@gmail.cOm");

        RegExp.isValid("1j");

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

        RomanNumeral.generate(1989);
        RomanNumeral.generate(2474);

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
        LongestSlideDown.longestSlideDown(pyramid);

        int[][] initState = new int[][]{{1, 0, 0}, {0, 1, 1}, {1, 1, 0}};
        int[][] generation = ConwayLife.getGeneration(initState, 3);
        //print2DArray(generation);

        int[] numbers = new int[]{3, 1336, 1337, 11208, 11209, 11211, 7890, 43210, 78901, 32109};
        for (int number : numbers) {
            int isInteresting = CarMileage.isInteresting(number, new int[]{1337, 8008135});
            String message;
            switch (isInteresting) {
                case 0:
                    message = number + " is not interesting.";
                    break;
                case 1:
                    message = number + " is almost an interesting number.";
                    break;
                case 2:
                    message = number + " is interesting.";
                    break;
                default:
                    message = "Invalid result";
            }
            //System.out.println(message);
        }

        int[][] spiral = TheClockwiseSpiral.createSpiral(4);
        //print2DArray(spiral);

        //System.out.println(HumanReadableTime.makeReadable(86399));

        Pattern mod4Regex = Pattern.compile("\\[[+-]?([048]|\\d*([02468][048]|[13579][26]))\\]");
        List<String> testStrings = Arrays.asList("No, [2014] isn't a multiple of 4...", "[+05620]", "[~24]", "[0]");
        for (String testString : testStrings) {
            //System.out.println(mod4Regex.matcher(testString).find());
        }
    }

    private static void print2DArray(int[][] _2DArray) {
        for (int[] row : _2DArray) {
            System.out.println(Arrays.toString(row));
        }
    }
}