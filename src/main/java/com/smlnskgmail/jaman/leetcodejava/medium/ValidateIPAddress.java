package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/validate-ip-address
public class ValidateIPAddress {

    private static final Set<Character> CHARS_IPv6 = new HashSet<>();

    static {
        String availableChars = "0123456789abcdefABCDEF";
        for (int i = 0; i < availableChars.length(); i++) {
            CHARS_IPv6.add(availableChars.charAt(i));
        }
    }

    private final String input;

    public ValidateIPAddress(String input) {
        this.input = input;
    }

    public String solution() {
        if (input.chars().filter(c -> c == '.').count() == 3) {
            return validateIPv4(input);
        }
        if (input.chars().filter(c -> c == ':').count() == 7) {
            return validateIPv6(input);
        }
        return "Neither";
    }

    private String validateIPv4(String ip) {
        String[] nums = ip.split("\\.", -1);
        for (String num : nums) {
            int length = num.length();
            if (length == 0 || length > 3) {
                return "Neither";
            }
            if (num.charAt(0) == '0' && length > 1) {
                return "Neither";
            }
            for (int i = 0; i < length; i++) {
                if (!Character.isDigit(num.charAt(i))) {
                    return "Neither";
                }
            }
            if (Integer.parseInt(num) > 255) {
                return "Neither";
            }
        }
        return "IPv4";
    }

    private String validateIPv6(String ip) {
        String[] parts = ip.split(":", -1);
        for (String part : parts) {
            int length = part.length();
            if (length == 0 || length > 4) {
                return "Neither";
            }
            for (int i = 0; i < length; i++) {
                if (!CHARS_IPv6.contains(part.charAt(i))) {
                    return "Neither";
                }
            }
        }
        return "IPv6";
    }

}
