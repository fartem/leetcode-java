package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class KidsWithTheGreatestNumberOfCandies {

    private final int[] candies;
    private final int extraCandies;

    public KidsWithTheGreatestNumberOfCandies(int[] candies, int extraCandies) {
        this.candies = candies;
        this.extraCandies = extraCandies;
    }

    public List<Boolean> solution() {
        List<Boolean> result = new ArrayList<>(candies.length);
        int max = Integer.MIN_VALUE;
        for (int count : candies) {
            if (count > max) {
                max = count;
            }
        }
        for (int count : candies) {
            result.add(count + extraCandies >= max);
        }
        return result;
    }

}
