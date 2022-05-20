package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/count-square-sum-triples/
public class CountSquareSumTriples {

    private final int input;

    public CountSquareSumTriples(int input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        int limit = input + 1;
        for (int i = 1; i < limit; i++) {
            for (int j = 1; j < limit; j++) {
                int k = i * i + j * j;
                int sqrt = (int) Math.sqrt(k);
                if (sqrt * sqrt == k && sqrt < limit) {
                    result++;
                }
            }
        }
        return result;
    }

}
