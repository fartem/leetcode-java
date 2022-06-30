package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/spiral-matrix/
public class SpiralMatrix {

    private final int[][] input;

    public SpiralMatrix(int[][] input) {
        this.input = input;
    }

    public List<Integer> solution() {
        int top = 0;
        int bottom = input.length - 1;
        int left = 0;
        int right = input[0].length - 1;
        List<Integer> result = new ArrayList<>();
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.add(input[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(input[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(input[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(input[i][left]);
                }
                left++;
            }
        }
        return result;
    }

}
