package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Arrays;

// https://leetcode.com/problems/the-number-of-weak-characters-in-the-game/
public class TheNumberOfWeakCharactersInTheGame {

    private final int[][] input;

    public TheNumberOfWeakCharactersInTheGame(int[][] input) {
        this.input = input;
    }

    public int solution() {
        Arrays.sort(
                input,
                (a, b) -> (a[0] == b[0])
                        ? Integer.compare(b[1], a[1])
                        : Integer.compare(a[0], b[0])
        );
        int result = 0;
        int n = input.length;
        int max = input[n - 1][1];
        for (int i = n - 2; i >= 0; i--) {
            int curr = input[i][1];
            if (curr < max) {
                result++;
            } else {
                max = curr;
            }
        }
        return result;
    }

}
