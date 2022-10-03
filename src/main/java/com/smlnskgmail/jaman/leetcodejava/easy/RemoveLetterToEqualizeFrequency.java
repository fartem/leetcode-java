package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/remove-letter-to-equalize-frequency/
public class RemoveLetterToEqualizeFrequency {

    private final String input;

    public RemoveLetterToEqualizeFrequency(String input) {
        this.input = input;
    }

    public boolean solution() {
        int[] freq = new int[26];
        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i) - 'a']++;
        }
        for (char c = 'a'; c <= 'z'; c++) {
            int i = c - 'a';
            if (freq[i] > 0) {
                freq[i]--;
                if (allSame(freq)) {
                    return true;
                }
                freq[i]++;
            }
        }
        return false;
    }

    private boolean allSame(int[] freq) {
        int same = 0;
        int i = 0;
        for (int f : freq) {
            if (f > 0) {
                same = f;
                break;
            }
        }
        for (int j = i + 1; j < freq.length; j++) {
            int curr = freq[j];
            if (curr > 0 && curr != same) {
                return false;
            }
        }
        return true;
    }

}
