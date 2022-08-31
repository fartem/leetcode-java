package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/pacific-atlantic-water-flow/
public class PacificAtlanticWaterFlow {

    private final int[][] input;

    public PacificAtlanticWaterFlow(int[][] input) {
        this.input = input;
    }

    public List<List<Integer>> solution() {
        int r = input.length;
        int c = input[0].length;
        boolean[][] atlantic = new boolean[r][c];
        boolean[][] pacific = new boolean[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 || j == 0) {
                    dfs(pacific, input, i, j, 0);
                }
                if (i == r - 1 || j == c - 1) {
                    dfs(atlantic, input, i, j, 0);
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (atlantic[i][j] && pacific[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        return result;
    }

    private void dfs(boolean[][] sea, int[][] grid, int r, int c, int prev) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) {
            return;
        }
        if (grid[r][c] < prev) {
            return;
        }
        if (sea[r][c]) {
            return;
        }
        sea[r][c] = true;
        dfs(sea, grid, r + 1, c, grid[r][c]);
        dfs(sea, grid, r - 1, c, grid[r][c]);
        dfs(sea, grid, r, c + 1, grid[r][c]);
        dfs(sea, grid, r, c - 1, grid[r][c]);
    }

}
