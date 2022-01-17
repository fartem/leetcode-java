package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/number-of-days-between-two-dates
public class NumberOfDaysBetweenTwoDates {

    private final String date1;
    private final String date2;

    public NumberOfDaysBetweenTwoDates(String date1, String date2) {
        this.date1 = date1;
        this.date2 = date2;
    }

    public int solution() {
        return Math.abs(date(date1) - date(date2));
    }

    private int date(String date) {
        int y = Integer.parseInt(date.substring(0, 4));
        int m = Integer.parseInt(date.substring(5, 7));
        int d = Integer.parseInt(date.substring(8, 10));
        int[] months = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int result = 0;
        for (int i = 1971; i < y; i++) {
            if (isLeap(i)) {
                result += 366;
            } else {
                result += 365;
            }
        }
        if (isLeap(y) && m > 2) {
            result++;
        }
        for (int i = 1; i < m; i++) {
            result += months[i];
        }
        return result + d;
    }

    private boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
