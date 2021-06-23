package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/count-of-matches-in-tournament
public class CountOfMatchesInTournament {

    private int input;

    public CountOfMatchesInTournament(int input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        while (input > 1) {
            result += input / 2;
            input = (input - 1) / 2 + 1;
        }
        return result;
    }

}
