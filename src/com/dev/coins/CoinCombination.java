package com.dev.coins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by john-orr on 25/11/16.
 */
public class CoinCombination implements Comparable {

    private List<Integer> denominations;
    private int numOfEachDenomination;

    public CoinCombination(Integer... coins) {
        denominations = new ArrayList<>(Arrays.asList(coins));
    }

    public void addCoin(Integer coin) {
        denominations.add(coin);
    }

    public Integer getSum() {
        Integer sum = 0;
        for (Integer denomination : denominations) {
            sum += denomination;
        }
        return sum;
    }

    public void setNumOfEachDenomination(int numOfEachDenomination) {
        this.numOfEachDenomination = numOfEachDenomination;
    }

    @Override
    public String toString() {
        Collections.sort(denominations);
        return "\nCoinCombination{" +
                "\n\tnumOfEachDenomination=" + numOfEachDenomination +
                ", \n\tdenominations=" + denominations +
                "\n}\n";
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof CoinCombination) {
            CoinCombination that = (CoinCombination) o;
            return this.numOfEachDenomination - that.numOfEachDenomination;
        } else {
            return 0;
        }
    }
}
