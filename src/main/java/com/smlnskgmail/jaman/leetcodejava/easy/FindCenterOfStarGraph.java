package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/find-center-of-star-graph
public class FindCenterOfStarGraph {

    private final int[][] input;

    public FindCenterOfStarGraph(int[][] input) {
        this.input = input;
    }

    public int solution() {
        return input[0][0] == input[1][0]
                ? input[0][0]
                : input[0][0] == input[1][1] ? input[0][0] : input[0][1];
    }
}
