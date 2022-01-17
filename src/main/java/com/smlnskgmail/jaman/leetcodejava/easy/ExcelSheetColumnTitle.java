package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/excel-sheet-column-title
public class ExcelSheetColumnTitle {

    private int input;

    public ExcelSheetColumnTitle(int input) {
        this.input = input;
    }

    public String solution() {
        StringBuilder result = new StringBuilder();
        while (input > 0) {
            input--;
            char c = (char) (input % 26 + 'A');
            input /= 26;
            result.append(c);
        }
        result.reverse();
        return result.toString();
    }
}
