package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/number-of-good-ways-to-split-a-string/
public class NumberOfGoodWaysToSplitAString {

    private final String input;

    public NumberOfGoodWaysToSplitAString(String input) {
        this.input = input;
    }

    public int solution() {
        Set<Character> lChars = new HashSet<>();
        Set<Character> rChars = new HashSet<>();
        int[] lCount = new int[input.length()];
        int[] rCount = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            char lC = input.charAt(i);
            if (!lChars.contains(lC)) {
                lChars.add(input.charAt(i));
            }
            lCount[i] = lChars.size();
            int rIndex = input.length() - i - 1;
            char rC = input.charAt(rIndex);
            if (!rChars.contains(rC)) {
                rChars.add(rC);
            }
            rCount[rIndex] = rChars.size();
        }
        int result = 0;
        int lP = 0;
        int rP = 1;
        while (lP != input.length() && rP != input.length()) {
            if (lCount[lP++] == rCount[rP++]) {
                result++;
            }
        }
        return result;
    }

}
