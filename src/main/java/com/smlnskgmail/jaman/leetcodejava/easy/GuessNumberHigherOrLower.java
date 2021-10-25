package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/guess-number-higher-or-lower
public class GuessNumberHigherOrLower {

    private final int input;
    private final int guess;

    public GuessNumberHigherOrLower(
            int input,
            int guess
    ) {
        this.input = input;
        this.guess = guess;
    }

    public int solution() {
        int l = 1;
        int r = input;
        while (l < r) {
            int m = l + (r - l) / 2;
            int guess = guess(m);
            if (guess == -1) {
                r = m;
            } else if (guess == 1) {
                l = m + 1;
            } else {
                l = m;
                break;
            }
        }
        return l;
    }

    private int guess(int number) {
        return Integer.compare(guess, number);
    }

}
