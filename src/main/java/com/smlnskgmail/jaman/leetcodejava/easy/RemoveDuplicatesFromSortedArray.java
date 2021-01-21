package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array
public class RemoveDuplicatesFromSortedArray {

    private final int[] input;

    public RemoveDuplicatesFromSortedArray(int[] input) {
        this.input = input;
    }

    public int solution() {
        if (input.length == 0) {
            return 0;
        }
        int newLength = 0;
        for (int i = 1; i < input.length; i++) {
            if (input[i] != input[newLength]) {
                newLength++;
                input[newLength] = input[i];
            }
        }
        return newLength + 1;
    }

}
