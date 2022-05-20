package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/
public class CheckIfWordEqualsSummationOfTwoWords {

    private final String firstWord;
    private final String secondWord;
    private final String targetWord;

    public CheckIfWordEqualsSummationOfTwoWords(
            String firstWord,
            String secondWord,
            String targetWord
    ) {
        this.firstWord = firstWord;
        this.secondWord = secondWord;
        this.targetWord = targetWord;
    }

    public boolean solution() {
        StringBuilder first = new StringBuilder();
        for (int i = 0; i < firstWord.length(); i++) {
            first.append(firstWord.charAt(i) - 97);
        }
        StringBuilder second = new StringBuilder();
        for (int i = 0; i < secondWord.length(); i++) {
            second.append(secondWord.charAt(i) - 97);
        }
        int sum = Integer.parseInt(first.toString()) + Integer.parseInt(second.toString());
        for (int i = targetWord.length() - 1; i >= 0; i--) {
            int pos = targetWord.charAt(i) - 97;
            int num = sum % 10;
            if (pos != num) {
                return false;
            }
            sum /= 10;
        }
        return sum == 0;
    }

}
