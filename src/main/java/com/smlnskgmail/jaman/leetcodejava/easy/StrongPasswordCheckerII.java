package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/strong-password-checker-ii/
public class StrongPasswordCheckerII {

    private final String input;

    public StrongPasswordCheckerII(String input) {
        this.input = input;
    }

    public boolean solution() {
        if (input.length() < 8) {
            return false;
        }
        Set<Character> special = new HashSet<>();
        String specialChars = "!@#$%^&*()-+";
        for (int i = 0; i < specialChars.length(); i++) {
            special.add(specialChars.charAt(i));
        }
        char prev = input.charAt(0);
        int digits = Character.isDigit(prev) ? 1 : 0;
        int upper = Character.isUpperCase(prev) ? 1 : 0;
        int lower = Character.isLowerCase(prev) ? 1 : 0;
        int spec = special.contains(prev) ? 1 : 0;
        for (int i = 1; i < input.length(); i++) {
            char curr = input.charAt(i);
            if (curr == prev) {
                return false;
            }
            digits += Character.isDigit(curr) ? 1 : 0;
            upper += Character.isUpperCase(curr) ? 1 : 0;
            lower += Character.isLowerCase(curr) ? 1 : 0;
            spec += special.contains(curr) ? 1 : 0;
            prev = curr;
        }
        return digits > 0 && upper > 0 && lower > 0 && spec > 0;
    }

}
