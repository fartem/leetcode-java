package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/number-of-good-ways-to-split-a-string
public class NumberOfGoodWaysToSplitAString {

    private final String s;

    public NumberOfGoodWaysToSplitAString(String input) {
        this.s = input;
    }

    public int solution() {
        Set<Character> lChars = new HashSet<>();
        Set<Character> rChars = new HashSet<>();
        int[] lCount = new int[s.length()];
        int[] rCount = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char lC = s.charAt(i);
            if (!lChars.contains(lC)) {
                lChars.add(s.charAt(i));
            }
            lCount[i] = lChars.size();
            int rIndex = s.length() - i - 1;
            char rC = s.charAt(rIndex);
            if (!rChars.contains(rC)) {
                rChars.add(rC);
            }
            rCount[rIndex] = rChars.size();
        }
        int result = 0;
        int lP = 0;
        int rP = 1;
        while (lP != s.length() && rP != s.length()) {
            if (lCount[lP++] == rCount[rP++]) {
                result++;
            }
        }
        return result;
    }

}
