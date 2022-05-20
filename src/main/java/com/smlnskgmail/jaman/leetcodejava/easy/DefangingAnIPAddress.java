package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/defanging-an-ip-address/
public class DefangingAnIPAddress {

    private final String input;

    public DefangingAnIPAddress(String input) {
        this.input = input;
    }

    public String solution() {
        char[] result = new char[input.length() + 6];
        int resultPointer = 0;
        int addressPointer = 0;
        while (addressPointer != input.length()) {
            char c = input.charAt(addressPointer);
            if (c == '.') {
                result[resultPointer++] = '[';
                result[resultPointer++] = '.';
                result[resultPointer++] = ']';
            } else {
                result[resultPointer++] = c;
            }
            addressPointer++;
        }
        return String.valueOf(result);
    }

}
