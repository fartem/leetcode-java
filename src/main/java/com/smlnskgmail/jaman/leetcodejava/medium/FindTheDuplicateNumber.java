package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/find-the-duplicate-number/
public class FindTheDuplicateNumber {

    private final int[] input;

    public FindTheDuplicateNumber(int[] input) {
        this.input = input;
    }

    public int solution() {
        int tortoise = input[0];
        int hare = input[0];
        do {
            tortoise = input[tortoise];
            hare = input[input[hare]];
        } while (tortoise != hare);
        tortoise = input[0];
        while (tortoise != hare) {
            tortoise = input[tortoise];
            hare = input[hare];
        }
        return hare;
    }

}
