package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/find-the-middle-index-in-array/
public class FindTheMiddleIndexInArray {

    private final int[] input;

    public FindTheMiddleIndexInArray(int[] input) {
        this.input = input;
    }

    public int solution() {
        int leftSum = 0;
        int totalSum = 0;
        for (int num : input) {
            totalSum += num;
        }
        for (int i = 0; i < input.length; i++) {
            int num = input[i];
            totalSum -= num;
            if (totalSum == leftSum) {
                return i;
            }
            leftSum += num;
        }
        return -1;
    }

}
