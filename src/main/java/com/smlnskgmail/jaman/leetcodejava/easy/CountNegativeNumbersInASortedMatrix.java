package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix
public class CountNegativeNumbersInASortedMatrix {

    private final int[][] input;

    public CountNegativeNumbersInASortedMatrix(int[][] input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        int first = 0;
        int second = 0;
        while (first != input.length) {
            if (input[first][second] < 0) {
                result++;
            }
            if (second == input[0].length - 1) {
                first++;
                second = 0;
            } else {
                second++;
            }
        }
        return result;
    }
}
