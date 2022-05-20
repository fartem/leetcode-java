package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/find-the-town-judge/
public class FindTheTownJudge {

    private final int n;
    private final int[][] input;

    public FindTheTownJudge(int n, int[][] input) {
        this.n = n;
        this.input = input;
    }

    public int solution() {
        int[] trustedBy = new int[n + 1];
        int[] trusted = new int[n + 1];
        for (int[] people : input) {
            int trustedByPeople = people[1];
            trustedBy[trustedByPeople] = trustedBy[trustedByPeople] + 1;

            int trustedPeople = people[0];
            trusted[trustedPeople] = trusted[trustedPeople] + 1;
        }
        for (int i = 1; i <= n; i++) {
            if (trustedBy[i] == n - 1 && trusted[i] == 0) {
                return i;
            }
        }
        return -1;
    }

}
