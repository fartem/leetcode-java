package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/find-pivot-index/
public class FindPivotIndex {

    private final int[] input;

    public FindPivotIndex(int[] input) {
        this.input = input;
    }

    public int solution() {
        int sum = 0;
        int atLeft = 0;
        for (int num : input) {
            sum += num;
        }
        for (int i = 0; i < input.length; i++) {
            if (atLeft == sum - atLeft - input[i]) {
                return i;
            }
            atLeft += input[i];
        }
        return -1;
    }

}
