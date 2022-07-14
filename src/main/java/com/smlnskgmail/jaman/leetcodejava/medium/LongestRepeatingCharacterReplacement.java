package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/longest-repeating-character-replacement/
public class LongestRepeatingCharacterReplacement {

    private final String s;
    private final int k;

    public LongestRepeatingCharacterReplacement(String s, int k) {
        this.s = s;
        this.k = k;
    }

    public int solution() {
        int[] freq = new int[26];
        int f = 0;
        int e = 0;
        int max = 0;
        int result = 0;
        for (; e < s.length(); e++) {
            int i = s.charAt(e) - 'A';
            freq[i]++;
            max = Math.max(max, freq[i]);

            int curr = e - f + 1;
            if (curr - max > k) {
                freq[s.charAt(f) - 'A']--;
                f++;
            }
            result = Math.max(result, e - f + 1);
        }
        return result;
    }

}
