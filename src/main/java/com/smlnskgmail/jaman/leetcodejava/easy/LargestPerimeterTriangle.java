package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Arrays;

// https://leetcode.com/problems/largest-perimeter-triangle
public class LargestPerimeterTriangle {

    private final int[] input;

    public LargestPerimeterTriangle(int[] input) {
        this.input = input;
    }

    public int solution() {
        Arrays.sort(input);
        for (int i = input.length - 1; i >= 2; i--) {
            int a = input[i - 2];
            int b = input[i - 1];
            int c = input[i];
            if (a + b > c) {
                return a + b + c;
            }
        }
        return 0;
    }
}
