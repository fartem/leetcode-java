package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/sort-array-by-parity-ii
public class SortArrayByParityII {

    private final int[] input;

    public SortArrayByParityII(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        int[] evens = new int[input.length / 2];
        int[] odds = new int[input.length / 2];
        int eP = 0;
        int oP = 0;
        for (int num : input) {
            if (num % 2 == 0) {
                evens[eP++] = num;
            } else {
                odds[oP++] = num;
            }
        }
        for (int i = 0; i < input.length; i++) {
            input[i] = i % 2 == 0 ? evens[--eP] : odds[--oP];
        }
        return input;
    }

}
