package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/buddy-strings
public class BuddyStrings {

    private final String s;
    private final String goal;

    public BuddyStrings(String s, String goal) {
        this.s = s;
        this.goal = goal;
    }

    public boolean solution() {
        if (s.length() != goal.length()) {
            return false;
        }
        if (s.equals(goal)) {
            int[] count = new int[26];
            int max = 1;
            for (int i = 0; i < s.length(); i++) {
                int index = s.charAt(i) - 'a';
                count[index]++;
                max = Math.max(max, count[index]);
            }
            return max > 1;
        } else {
            int first = -1;
            int second = -1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    if (first == -1) {
                        first = i;
                    } else if (second == -1) {
                        second = i;
                    } else {
                        return false;
                    }
                }
            }
            return first != -1
                    && second != -1
                    && s.charAt(first) == goal.charAt(second)
                    && s.charAt(second) == goal.charAt(first);
        }
    }

}
