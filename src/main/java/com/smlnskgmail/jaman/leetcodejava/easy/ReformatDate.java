package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/reformat-date
public class ReformatDate {

    private static final Map<String, String> MONTHS = new HashMap<>();

    private final String input;

    public ReformatDate(String input) {
        MONTHS.put("Jan", "01");
        MONTHS.put("Feb", "02");
        MONTHS.put("Mar", "03");
        MONTHS.put("Apr", "04");
        MONTHS.put("May", "05");
        MONTHS.put("Jun", "06");
        MONTHS.put("Jul", "07");
        MONTHS.put("Aug", "08");
        MONTHS.put("Sep", "09");
        MONTHS.put("Oct", "10");
        MONTHS.put("Nov", "11");
        MONTHS.put("Dec", "12");
        this.input = input;
    }

    public String solution() {
        int length = input.length();
        StringBuilder result = new StringBuilder();
        result.append(
                input.substring(
                        length - 4,
                        length
                )
        );
        result.append("-");
        result.append(
                MONTHS.get(
                        input.substring(
                                length - 8,
                                length - 5
                        )
                )
        );
        result.append("-");
        result.append(
                input.indexOf(" ") == 4
                        ? input.substring(0, 2)
                        : "0" + input.charAt(0)
        );
        return result.toString();
    }

}
