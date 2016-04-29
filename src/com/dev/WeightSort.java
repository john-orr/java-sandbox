package com.dev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by john-orr on 29/04/16.
 */
public class WeightSort {

    public static String orderWeight(String strng) {

        List<Weight> weightList = createWeightList(strng);

        Collections.sort(weightList);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < weightList.size(); i++) {
            stringBuilder.append(weightList.get(i));
            if (i != weightList.size() - 1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    private static List<Weight> createWeightList(String arrayInput) {
        String[] weights = arrayInput.split(" ");
        List<Weight> weightList = new ArrayList<>();
        for (String weightStr : weights) {
            Weight weight = new Weight(weightStr);
            weightList.add(weight);
        }
        return weightList;
    }

    static class Weight implements Comparable {

        private String weight;

        Weight(String weight) {
            this.weight = weight;
        }

        private int sumDigits() {
            int sum = 0;
            for (int i = 0; i < weight.length(); i++) {
                sum += Integer.parseInt(String.valueOf(weight.charAt(i)));
            }
            return sum;
        }

        @Override
        public int compareTo(Object o) {
            Weight that = (Weight) o;
            int diff = this.sumDigits() - that.sumDigits();
            if (diff == 0) {
                diff = this.weight.compareTo(that.weight);
            }
            return diff;
        }

        @Override
        public String toString() {
            return weight;
        }
    }
}
