package com.smlnskgmail.jaman.leetcodejava.easy;

public class FindWinnerOnATicTacToeGame {

    private final int[][] input;

    public FindWinnerOnATicTacToeGame(int[][] input) {
        this.input = input;
    }

    public String solution() {
        String[][] board = new String[3][3];
        boolean isX = true;
        for (int[] move : input) {
            board[move[0]][move[1]] = isX ? "A" : "B";
            isX = !isX;
        }
        for (int i = 0; i < 3; i++) {
            String a = board[i][0];
            if (isValid(a, board[i][1], board[i][2])) {
                return a;
            }
            a = board[0][i];
            if (isValid(a, board[1][i], board[2][i])) {
                return a;
            }
        }
        String a = board[0][0];
        if (isValid(a, board[1][1], board[2][2])) {
            return a;
        }
        a = board[0][2];
        if (isValid(a, board[1][1], board[2][0])) {
            return a;
        }
        return input.length == 9 ? "Draw" : "Pending";
    }

    private boolean isValid(String a, String b, String c) {
        return a != null && a == b && a == c;
    }

}
