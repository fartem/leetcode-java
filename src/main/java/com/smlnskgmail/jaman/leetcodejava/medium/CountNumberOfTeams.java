package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/count-number-of-teams
public class CountNumberOfTeams {

    private final int[] input;

    public CountNumberOfTeams(int[] input) {
        this.input = input;
    }

    public int solution() {
        int length = input.length;
        int[] up = new int[length];
        int[] down = new int[length];
        int result = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i; j >= 0; j--) {
                if (input[i] > input[j]) {
                    up[i]++;
                    result += up[j];
                }
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = i; j >= 0; j--) {
                if (input[i] < input[j]) {
                    down[i]++;
                    result += down[j];
                }
            }
        }
        return result;
    }

}
