package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
public class ElementAppearingMoreThan25InSortedArray {

    private final int[] input;

    public ElementAppearingMoreThan25InSortedArray(int[] input) {
        this.input = input;
    }

    public int solution() {
        int size = input.length;
        int portion = size / 4;
        for (int i = 0; i < size - portion; i++) {
            int num = input[i];
            if (num == input[i + portion]) {
                return num;
            }
        }
        return -1;
    }

}
