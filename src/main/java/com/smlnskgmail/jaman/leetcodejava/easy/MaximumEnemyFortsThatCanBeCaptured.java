package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/maximum-enemy-forts-that-can-be-captured/
public class MaximumEnemyFortsThatCanBeCaptured {

    private final int[] input;

    public MaximumEnemyFortsThatCanBeCaptured(int[] input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        for (int i = 0, j = 0; i < input.length; i++) {
            int curr = input[i];
            if (curr != 0) {
                if (input[j] == -curr) {
                    result = Math.max(result, i - j - 1);
                }
                j = i;
            }
        }
        return result;
    }

}
