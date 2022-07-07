package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/valid-sudoku/
public class ValidSudoku {

    private final char[][] input;

    public ValidSudoku(char[][] input) {
        this.input = input;
    }

    public boolean solution() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char curr = input[i][j];
                if (curr != '.') {
                    if (!isValid(input, i, j, curr)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int r, int c, char num) {
        for (int i = c + 1; i < 9; i++) {
            if (board[r][i] == num) {
                return false;
            }
        }
        for (int i = r + 1; i < 9; i++) {
            if (board[i][c] == num) {
                return false;
            }
        }
        int x = r - r % 3;
        int y = c - c % 3;
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                if (board[i][j] == num && !(i == r && j == c)) {
                    return false;
                }
            }
        }
        return true;
    }

}
