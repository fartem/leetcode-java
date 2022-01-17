package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/check-if-all-as-appears-before-all-bs
public class CheckIfAllAsAppearsBeforeAllBs {

    private final String input;

    public CheckIfAllAsAppearsBeforeAllBs(String input) {
        this.input = input;
    }

    public boolean solution() {
        return !input.contains("ba");
    }
}
