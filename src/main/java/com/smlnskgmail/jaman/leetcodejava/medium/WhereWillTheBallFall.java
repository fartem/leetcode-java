package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/where-will-the-ball-fall/
public class WhereWillTheBallFall {

    private final int[][] input;

    public WhereWillTheBallFall(int[][] input) {
        this.input = input;
    }

    public int[] solution() {
        int c = input[0].length;
        int[] result = new int[c];
        for (int i = 0; i < c; i++) {
            result[i] = dfs(input, 0, i);
        }
        return result;
    }

    private int dfs(int[][] grid, int i, int j) {
        int curr = grid[i][j];
        if ((j == 0 && curr == -1) || (j == grid[i].length - 1 && curr == 1)) {
            return -1;
        }
        if (curr == 1) {
            if (curr != grid[i][j + 1]) {
                return -1;
            }
        } else if (curr != grid[i][j - 1]) {
            return -1;
        }
        if (i == grid.length - 1) {
            return curr == 1 ? j + 1 : j - 1;
        }
        i++;
        j += curr == 1 ? 1 : -1;
        return dfs(grid, i, j);
    }

}
