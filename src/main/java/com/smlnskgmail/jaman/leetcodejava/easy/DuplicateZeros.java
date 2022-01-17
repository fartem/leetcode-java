package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/duplicate-zeros
public class DuplicateZeros {

    private final int[] input;

    public DuplicateZeros(int[] input) {
        this.input = input;
    }

    public void solution() {
        int possibleDups = 0;
        int length = input.length - 1;
        for (int left = 0; left <= length - possibleDups; left++) {
            if (input[left] == 0) {
                if (left == length - possibleDups) {
                    input[length] = 0;
                    length -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        int last = length - possibleDups;
        for (int i = last; i >= 0; i--) {
            if (input[i] == 0) {
                input[i + possibleDups] = 0;
                possibleDups--;
                input[i + possibleDups] = 0;
            } else {
                input[i + possibleDups] = input[i];
            }
        }
    }
}
