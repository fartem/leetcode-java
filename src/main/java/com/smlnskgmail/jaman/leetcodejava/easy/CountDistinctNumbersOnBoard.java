package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/count-distinct-numbers-on-board/
public class CountDistinctNumbersOnBoard {

    private final int input;

    public CountDistinctNumbersOnBoard(int input) {
        this.input = input;
    }

    public int solution() {
        return Math.max(1, input - 1);
    }

}
