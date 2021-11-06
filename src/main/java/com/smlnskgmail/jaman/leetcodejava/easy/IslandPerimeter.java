package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/island-perimeter
public class IslandPerimeter {

    private final int[][] input;

    public IslandPerimeter(int[][] input) {
        this.input = input;
    }

    public int solution() {
        if (input.length == 0 || input[0].length == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j] == 1) {
                    result += 4;
                    if (i > 0 && input[i - 1][j] == 1) {
                        result -= 2;
                    }
                    if (j > 0 && input[i][j - 1] == 1) {
                        result -= 2;
                    }
                }
            }
        }
        return result;
    }

}
