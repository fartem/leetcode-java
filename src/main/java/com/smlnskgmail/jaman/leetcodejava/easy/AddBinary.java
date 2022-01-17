package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/add-binary
public class AddBinary {

    private final String a;
    private final String b;

    public AddBinary(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String solution() {
        String max = a.length() > b.length() ? a : b;
        String min = max == a ? b : a;
        int maxPointer = max.length() - 1;
        int minPointer = min.length() - 1;
        StringBuilder result = new StringBuilder();
        int additional = 0;
        while (minPointer >= 0) {
            char charInMax = max.charAt(maxPointer);
            char charInMin = min.charAt(minPointer);
            if (additional == 1) {
                result.append(charInMax == charInMin ? '1' : '0');
                if (charInMax == '0' && charInMin == '0') {
                    additional = 0;
                }
            } else {
                if (charInMax == '1' && charInMin == '1') {
                    additional = 1;
                    result.append('0');
                } else {
                    result.append(charInMax == '1' || charInMin == '1' ? '1' : '0');
                }
            }
            maxPointer--;
            minPointer--;
        }
        while (maxPointer >= 0) {
            char charInMax = max.charAt(maxPointer);
            if (additional == 1 && charInMax == '1') {
                result.append('0');
            } else {
                if (additional == 1) {
                    result.append('1');
                    additional = 0;
                } else {
                    result.append(charInMax);
                }
            }
            maxPointer--;
        }
        if (additional == 1) {
            result.append('1');
        }
        return result.reverse().toString();
    }
}
