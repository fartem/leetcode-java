package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/number-of-valid-words-in-a-sentence/
public class NumberOfValidWordsInASentence {

    private final String input;

    public NumberOfValidWordsInASentence(String input) {
        this.input = input;
    }

    public int solution() {
        int result = 0;
        for (String word : input.split("\\s+")) {
            if (word.isEmpty()) {
                continue;
            }
            if (checkFirstRule(word) && checkSecondRule(word) && checkThirdRule(word)) {
                result++;
            }
        }
        return result;
    }

    private boolean checkFirstRule(String token) {
        for (int i = 0; i < token.length(); i++) {
            char curr = token.charAt(i);
            if (Character.isDigit(curr)
                    || (Character.isLetter(curr) && Character.isUpperCase(curr))) {
                return false;
            }
        }
        return true;
    }

    private boolean checkSecondRule(String token) {
        int n = token.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (token.charAt(i) == '-') {
                count++;
                if (count > 1) {
                    break;
                }
                if (i == 0 || i == n - 1) {
                    return false;
                }
                if (!Character.isLetter(token.charAt(i - 1))
                        || !Character.isLetter(token.charAt(i + 1))) {
                    return false;
                }
            }
        }
        return count < 2;
    }

    private boolean checkThirdRule(String token) {
        for (int i = 0; i < token.length() - 1; i++) {
            char curr = token.charAt(i);
            if (!Character.isLetter(curr)
                    && !Character.isDigit(curr) && curr != '-') {
                return false;
            }
        }
        return true;


    }
}
