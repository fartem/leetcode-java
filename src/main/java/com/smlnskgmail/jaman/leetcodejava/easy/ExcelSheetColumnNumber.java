package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/excel-sheet-column-number
public class ExcelSheetColumnNumber {

    private final String input;

    public ExcelSheetColumnNumber(String input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            result *= 26;
            result += input.charAt(i) - 'A' + 1;
        }
        return result;
    }

}
