package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/day-of-the-week
public class DayOfTheWeek {

    private static final String[] DAY_OF_WEEK =
            new String[] {
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
            };
    private static final int[] MONTHS =
            new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private int day;
    private final int month;
    private final int year;

    public DayOfTheWeek(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String solution() {
        for (int i = 1971; i < year; i++) {
            day += isLeap(i) ? 366 : 365;
        }
        if (month > 2 && isLeap(year)) {
            day++;
        }
        for (int i = 1; i < month; i++) {
            day += MONTHS[i];
        }
        return DAY_OF_WEEK[(day + 4) % 7];
    }

    public boolean isLeap(long year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
