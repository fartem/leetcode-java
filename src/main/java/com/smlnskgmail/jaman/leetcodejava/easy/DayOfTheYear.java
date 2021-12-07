package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/day-of-the-year
public class DayOfTheYear {

    private final static int[] DAYS = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private final String input;

    public DayOfTheYear(String input) {
        this.input = input;
    }

    public int solution() {
        int y = Integer.parseInt(input.substring(0, 4));
        int m = Integer.parseInt(input.substring(5, 7));
        int d = Integer.parseInt(input.substring(8, 10));
        int day = 0;
        if (m > 2 && ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)) {
            day++;
        }
        for (int i = 1; i < m; i++) {
            day += DAYS[i];
        }
        return day + d;
    }

}
