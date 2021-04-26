package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence
public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {

    private final String sentence;
    private final String searchWord;

    public CheckIfAWordOccursAsAPrefixOfAnyWordInASentence(
            String sentence,
            String searchWord
    ) {
        this.sentence = sentence;
        this.searchWord = searchWord;
    }

    public int solution() {
        StringBuilder word = new StringBuilder();
        int index = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            word.append(c);
            if (c == ' ' || i == sentence.length() - 1) {
                index++;
                if (word.toString().startsWith(searchWord)) {
                    return index;
                } else {
                    word.setLength(0);
                }
            }
        }
        return -1;
    }

}
