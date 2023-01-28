package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
public class MinimumCostToMoveChipsToTheSamePosition {

    private final int[] input;

    public MinimumCostToMoveChipsToTheSamePosition(int[] input) {
        this.input = input;
    }

    public int solution() {
        int even = 0;
        int odd = 0;
        for (int pos : input) {
            if (pos % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.min(even, odd);
    }

}
