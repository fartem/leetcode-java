package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-anagrams-in-a-string/
public class FindAllAnagramsInAString {

    private final String s;
    private final String p;

    public FindAllAnagramsInAString(String s, String p) {
        this.s = s;
        this.p = p;
    }

    public List<Integer> solution() {
        List<Integer> result = new ArrayList<>();
        int[] cP = new int[26];
        for (int i = 0; i < p.length(); i++) {
            cP[p.charAt(i) - 'a']++;
        }
        int[] cS = new int[26];
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            cS[s.charAt(i) - 'a']++;
            if (i - c + 1 < p.length()) {
                continue;
            }
            if (isAnagram(cS, cP)) {
                result.add(c);
            }
            cS[s.charAt(c) - 'a']--;
            c++;
        }
        return result;
    }

    private boolean isAnagram(int[] cS, int[] cP) {
        for (int i = 0; i < cS.length; i++) {
            if (cS[i] != cP[i]) {
                return false;
            }
        }
        return true;
    }

}
