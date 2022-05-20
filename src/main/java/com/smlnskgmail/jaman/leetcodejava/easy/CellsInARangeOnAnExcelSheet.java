package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/
public class CellsInARangeOnAnExcelSheet {

    private final String s;

    public CellsInARangeOnAnExcelSheet(String input) {
        this.s = input;
    }

    public List<String> solution() {
        String[] parts = s.split(":");
        char startChar = parts[0].charAt(0);
        int startNum = Integer.parseInt(parts[0].substring(1));
        char endChar = parts[1].charAt(0);
        int endNum = Integer.parseInt(parts[1].substring(1));
        List<String> result = new ArrayList<>();
        while (startChar <= endChar) {
            for (int i = startNum; i <= endNum; i++) {
                String cell = new StringBuilder().append(startChar).append(i).toString();
                result.add(cell);
            }
            startChar++;
        }
        return result;
    }

}
