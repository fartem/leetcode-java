package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/minimum-suffix-flips/
public class MinimumSuffixFlips {

    private final String target;

    public MinimumSuffixFlips(String input) {
        this.target = input;
    }

    public int solution() {
        char flip = '0';
        int result = 0;
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) != flip) {
                flip = target.charAt(i);
                result++;
            }
        }
        return result;
    }

}
