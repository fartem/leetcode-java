package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/determine-color-of-a-chessboard-square
public class DetermineColorOfAChessboardSquare {

    private final String input;

    public DetermineColorOfAChessboardSquare(String input) {
        this.input = input;
    }

    public boolean solution() {
        int letter = input.charAt(0) - 96;
        int number = input.charAt(1);
        return (letter % 2 == 0 && number % 2 != 0)
                || (letter % 2 == 1 && number % 2 == 0);
    }

}
