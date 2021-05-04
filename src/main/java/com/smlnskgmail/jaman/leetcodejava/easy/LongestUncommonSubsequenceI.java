package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/longest-uncommon-subsequence-i
public class LongestUncommonSubsequenceI {

    private final String a;
    private final String b;

    public LongestUncommonSubsequenceI(
            String a,
            String b
    ) {
        this.a = a;
        this.b = b;
    }

    public int solution() {
        Set<Character> charsInA = new HashSet<>();
        for (int i = 0; i < a.length(); i++) {
            charsInA.add(a.charAt(i));
        }
        boolean hasDiff = false;
        for (int i = 0; i < b.length(); i++) {
            if (!charsInA.contains(b.charAt(i))) {
                hasDiff = true;
                break;
            }
        }
        if (!hasDiff) {
            hasDiff = a.length() != b.length();
        }
        return hasDiff ? Math.max(a.length(), b.length()) : -1;
    }

}
