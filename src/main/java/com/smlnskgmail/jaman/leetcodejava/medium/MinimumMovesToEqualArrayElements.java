package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
public class MinimumMovesToEqualArrayElements {

    private final int[] input;

    public MinimumMovesToEqualArrayElements(int[] input) {
        this.input = input;
    }

    public int solution() {
        int min = input[0];
        int sum = 0;
        for (int num : input) {
            if (num < min) {
                min = num;
            }
            sum += num;
        }
        return sum - input.length * min;
    }

}
