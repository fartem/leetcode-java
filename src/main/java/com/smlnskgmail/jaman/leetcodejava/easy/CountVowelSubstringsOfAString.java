package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/count-vowel-substrings-of-a-string
public class CountVowelSubstringsOfAString {

    private final String input;

    public CountVowelSubstringsOfAString(String input) {
        this.input = input;
    }

    public int solution() {
        int length = input.length();
        if (length < 5) {
            return 0;
        }
        int[] vowels = new int[128];
        vowels['a'] = 1;
        vowels['e'] = 1;
        vowels['i'] = 1;
        vowels['o'] = 1;
        vowels['u'] = 1;
        int result = 0;
        for (int i = 0; i < length; i++) {
            int[] chars = new int[128];
            for (int j = i + 5; j <= length; j++) {
                boolean onlyVowels = true;
                for (int k = i; k < j; k++) {
                    char c = input.charAt(k);
                    if (vowels[c] == 1) {
                        chars[input.charAt(k)] = 1;
                    } else {
                        onlyVowels = false;
                        break;
                    }
                }
                if (onlyVowels) {
                    if (chars['a'] == 1
                            && chars['e'] == 1
                            && chars['i'] == 1
                            && chars['o'] == 1
                            && chars['u'] == 1) {
                        result++;
                    }
                } else {
                    break;
                }
            }
        }
        return result;
    }
}
