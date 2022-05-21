package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/set-mismatch/
public class SetMismatch {

    private final int[] input;

    public SetMismatch(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        int rep = 0;
        int[] uniq = new int[input.length + 1];
        for (int num : input) {
            if (uniq[num] == 1) {
                rep = num;
            } else {
                uniq[num] = 1;
            }
        }
        int miss = 0;
        for (int i = 1; i < input.length + 1; i++) {
            if (uniq[i] == 0) {
                miss = i;
                break;
            }
        }
        return new int[]{rep, miss};
    }

}
