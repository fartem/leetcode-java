package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/unique-binary-search-trees/
public class UniqueBinarySearchTrees {

    private final int input;

    public UniqueBinarySearchTrees(int input) {
        this.input = input;
    }

    public int solution() {
        int[] catalan = new int[input + 2];
        catalan[0] = 1;
        catalan[1] = 1;
        for (int i = 2; i <= input; i++) {
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - j - 1];
            }
        }
        return catalan[input];
    }

}
