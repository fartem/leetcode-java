package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/number-of-islands/
public class NumberOfIslands {

    private final char[][] input;

    public NumberOfIslands(char[][] input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                if (input[i][j] == '1') {
                    result++;
                    dfs(input, i, j);
                }
            }
        }
        return result;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }

}
