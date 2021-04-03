package com.smlnskgmail.jaman.leetcodejava.easy;

public class PeakIndexInAMountainArray {

    private final int[] input;

    public PeakIndexInAMountainArray(int[] input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        int max = 0;
        for (int i = 0; i < input.length; i++) {
            int num = input[i];
            if (num > max) {
                max = num;
                result = i;
            }
        }
        return result;
    }

}
