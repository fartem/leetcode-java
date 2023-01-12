package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/count-and-say/
public class CountAndSay {

    private final int input;

    public CountAndSay(int input) {
        this.input = input;
    }

    public String solution() {
        return countAndSay(input);
    }

    private String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        var str = countAndSay(n - 1);
        var result = new StringBuilder();
        var count = 1;
        int i;
        for (i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                result.append((char) (count + 48)).append(str.charAt(i - 1));
                count = 1;
            } else {
                count++;
            }
        }
        result.append((char) (count + 48)).append(str.charAt(i - 1));
        return result.toString();
    }

}
