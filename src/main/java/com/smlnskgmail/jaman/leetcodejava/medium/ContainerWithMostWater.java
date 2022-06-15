package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater {

    private final int[] input;

    public ContainerWithMostWater(int[] input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        int left = 0;
        int right = input.length - 1;
        while (left < right) {
            int l = input[left];
            int r = input[right];
            result = Math.max(result, (right - left) * Math.min(l, r));
            if (l > r) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }

}
