package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/latest-time-by-replacing-hidden-digits/
public class LatestTimeByReplacingHiddenDigits {

    private final String input;

    public LatestTimeByReplacingHiddenDigits(String input) {
        this.input = input;
    }

    public String solution() {
        StringBuilder result = new StringBuilder();
        char fHour = input.charAt(0);
        char sHour = input.charAt(1);
        if (fHour == '?') {
            result.append(sHour == '?' || sHour < 52 ? '2' : '1');
        } else {
            result.append(fHour);
        }
        if (sHour == '?') {
            result.append(result.charAt(0) == '2' ? '3' : '9');
        } else {
            result.append(sHour);
        }
        result.append(':');

        char fMinute = input.charAt(3);
        result.append(fMinute == '?' ? '5' : fMinute);

        char sMinute = input.charAt(4);
        result.append(sMinute == '?' ? '9' : sMinute);
        return result.toString();
    }

}
