package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters/
public class ReplaceAllQuestionMarksAvoidConsecutiveRepeatingCharacters {

    private final String input;

    public ReplaceAllQuestionMarksAvoidConsecutiveRepeatingCharacters(String input) {
        this.input = input;
    }

    public String solution() {
        int offset = -1;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '?') {
                offset++;
                if (offset == 26) {
                    offset = 0;
                }
                char candidate = (char) (97 + offset);
                char prev = i == 0 ? '0' : input.charAt(i - 1);
                char next = i == input.length() - 1 ? '0' : input.charAt(i + 1);
                while (candidate == prev || candidate == next) {
                    offset++;
                    if (offset == 26) {
                        offset = 0;
                    }
                    candidate = (char) (97 + offset);
                }
                result.append(candidate);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

}
