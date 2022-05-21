package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/sort-colors/
public class SortColors {

    private final int[] input;

    public SortColors(int[] input) {
        this.input = input;
    }

    public void solution() {
        int l = 0;
        int m = 0;
        int h = input.length - 1;
        while (m <= h) {
            if (input[m] == 0) {
                swap(input, m, l);
                m++;
                l++;
            } else if (input[m] == 1) {
                m++;
            } else {
                swap(input, m, h);
                h--;
            }
        }
    }

    private void swap(int[] nums, int f, int s) {
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }

}
