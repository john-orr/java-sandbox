package com.dev;

/**
 * Created by john-orr on 04/04/16.
 */
public class FindOutlier {

    static int find(int[] integers) {
        for (int i : integers) {
            System.out.print(i + ", ");
        }
        System.out.println();
        int oddNumbers = 0;
        int evenNumbers = 0;
        int iterator = 0;
        int oddNumber = 0;
        int evenNumber = 0;
        while (oddNumbers < 1 || evenNumbers < 1) {
            int number = integers[iterator];
            if (number % 2 == 0) {
                evenNumbers++;
                evenNumber = number;
            } else {
                oddNumbers++;
                oddNumber = number;
            }
            iterator++;
        }
        return evenNumbers == 1 ? evenNumber : oddNumber;
    }
}
