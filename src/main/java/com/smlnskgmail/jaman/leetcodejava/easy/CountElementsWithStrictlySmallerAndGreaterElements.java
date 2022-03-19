package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements
public class CountElementsWithStrictlySmallerAndGreaterElements {

    private final int[] input;

    public CountElementsWithStrictlySmallerAndGreaterElements(int[] input) {
        this.input = input;
    }

    public int solution() {
        int min = input[0];
        int max = input[0];
        for (int num : input) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        if (min == max) {
            return 0;
        }
        int minCount = 0;
        int maxCount = 0;
        for (int num : input) {
            if (num == min) {
                minCount++;
            } else if (num == max) {
                maxCount++;
            }
        }
        return input.length - minCount - maxCount;
    }

}
