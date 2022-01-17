package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/find-words-that-can-be-formed-by-characters
public class FindWordsThatCanBeFormedByCharacters {

    private final String[] words;
    private final String chars;

    public FindWordsThatCanBeFormedByCharacters(String[] words, String chars) {
        this.words = words;
        this.chars = chars;
    }

    public int solution() {
        int result = 0;
        int[] letters = new int[128];
        for (int i = 0; i < chars.length(); i++) {
            int index = chars.charAt(i);
            letters[index] = letters[index] + 1;
        }
        for (String word : words) {
            boolean breaked = false;
            int[] lettersInWord = new int[128];
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i);
                if (letters[index] == 0) {
                    breaked = true;
                    break;
                } else {
                    int count = lettersInWord[index] + 1;
                    if (count <= letters[index]) {
                        lettersInWord[index] = count;
                    } else {
                        breaked = true;
                        break;
                    }
                }
            }
            if (!breaked) {
                result += word.length();
            }
        }
        return result;
    }
}
