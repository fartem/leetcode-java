package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/delete-columns-to-make-sorted/
public class DeleteColumnsToMakeSorted {

    private final String[] input;

    public DeleteColumnsToMakeSorted(String[] input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        for (int i = 0; i < input[0].length(); i++) {
            for (int j = 1; j < input.length; j++) {
                if (input[j].charAt(i) < input[j - 1].charAt(i)) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }

}
