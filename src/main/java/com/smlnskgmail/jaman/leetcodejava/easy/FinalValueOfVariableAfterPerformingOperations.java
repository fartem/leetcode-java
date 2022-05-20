package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
public class FinalValueOfVariableAfterPerformingOperations {

    private final String[] input;

    public FinalValueOfVariableAfterPerformingOperations(String[] input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        for (String op : input) {
            if (op.charAt(0) == '-' || op.charAt(2) == '-') {
                result--;
            } else {
                result++;
            }
        }
        return result;
    }

}
