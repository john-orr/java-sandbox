package com.dev.coins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by john-orr on 25/11/16.
 */
public class CoinCombinationsCalculator {

    private static final List<Integer> coins = Arrays.asList(1, 2, 5, 10, 20, 50, 100, 200);

    public static List<CoinCombination> calculate(int total, int numCoins) {
        if (numCoins > coins.size()) {
            throw new IllegalArgumentException("Not enough denominations");
        }
        List<CoinCombination> possibleCombinations = buildPossibleCombinations(coins, numCoins);
        List<CoinCombination> validCombinations = new ArrayList<>();
        for (CoinCombination combination : possibleCombinations) {
            int combinationSum = combination.getSum();
            if (total % combinationSum == 0) {
                int factor = total / combinationSum;
                combination.setNumOfEachDenomination(factor);
                validCombinations.add(combination);
            }
        }
        Collections.sort(validCombinations);
        return validCombinations;
    }

    private static List<CoinCombination> buildPossibleCombinations(List<Integer> coins, int numCoins) {
        if (numCoins == 1) {
            List<CoinCombination> returnList = new ArrayList<>();
            for (Integer coin : coins) {
                CoinCombination combination = new CoinCombination(coin);
                returnList.add(combination);
            }
            return returnList;
        } else {
            List<CoinCombination> possibleCombinations = new ArrayList<>();
            for (int i = 0; i < coins.size(); i++) {
                List<Integer> remainingCoins = coins.subList(i + 1, coins.size());
                List<CoinCombination> possibleCombinationsOfRemainingCoins = buildPossibleCombinations(remainingCoins,
                        numCoins - 1);
                for (CoinCombination combination : possibleCombinationsOfRemainingCoins) {
                    combination.addCoin(coins.get(i));
                }
                possibleCombinations.addAll(possibleCombinationsOfRemainingCoins);
            }
            return possibleCombinations;
        }
    }
}
