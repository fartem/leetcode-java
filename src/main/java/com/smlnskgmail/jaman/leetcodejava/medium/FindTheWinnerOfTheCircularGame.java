package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/find-the-winner-of-the-circular-game/
public class FindTheWinnerOfTheCircularGame {

    private final int n;
    private final int k;

    public FindTheWinnerOfTheCircularGame(int n, int k) {
        this.n = n;
        this.k = k;
    }

    public int solution() {
        return findTheWinner(n, k);
    }

    private int findTheWinner(int n, int k) {
        if (n == 1) {
            return 1;
        }
        return (findTheWinner(n - 1, k) + k - 1) % n + 1;
    }

}
