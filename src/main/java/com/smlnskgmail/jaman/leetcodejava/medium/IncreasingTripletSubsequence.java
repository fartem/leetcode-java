package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/increasing-triplet-subsequence/
public class IncreasingTripletSubsequence {

    private final int[] input;

    public IncreasingTripletSubsequence(int[] input) {
        this.input = input;
    }

    public boolean solution() {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        for (int num : input) {
            if (num < a) {
                a = num;
            }
            if (num < b && num > a) {
                b = num;
            }
            if (num > a && num > b) {
                return true;
            }
        }
        return false;
    }

}
