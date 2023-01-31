package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/distribute-candies-to-people/
public class DistributeCandiesToPeople {

    private int candies;
    private final int numPeople;

    public DistributeCandiesToPeople(
            int candies,
            int numPeople
    ) {
        this.candies = candies;
        this.numPeople = numPeople;
    }

    public int[] solution() {
        int[] result = new int[numPeople];
        for (int i = 0; candies > 0; candies -= i) {
            result[i % numPeople] += Math.min(candies, ++i);
        }
        return result;
    }

}
