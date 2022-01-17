package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/greatest-common-divisor-of-strings
public class GreatestCommonDivisorOfStrings {

    private final String first;
    private final String second;

    public GreatestCommonDivisorOfStrings(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public String solution() {
        int firstLength = first.length();
        int secondLength = second.length();
        int maxLength = Math.max(firstLength, secondLength);
        for (int i = maxLength; i >= 1; i--) {
            if (firstLength % i == 0 && secondLength % i == 0) {
                String firstSub = first.substring(0, i);
                String secondSub = second.substring(0, i);
                if (firstSub.equals(secondSub)) {
                    if ((first.substring(i) + firstSub).equals(first)
                            && (second.substring(i) + secondSub).equals(second)) {
                        return firstSub;
                    }
                }
            }
        }
        return "";
    }
}
