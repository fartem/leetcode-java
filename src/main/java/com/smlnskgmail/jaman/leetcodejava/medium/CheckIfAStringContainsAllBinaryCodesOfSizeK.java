package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/
public class CheckIfAStringContainsAllBinaryCodesOfSizeK {

    private final String s;
    private final int k;

    public CheckIfAStringContainsAllBinaryCodesOfSizeK(String s, int k) {
        this.s = s;
        this.k = k;
    }

    public boolean solution() {
        int need = 1 << k;
        Set<String> exists = new HashSet<>();
        for (int i = k; i <= s.length(); i++) {
            String str = s.substring(i - k, i);
            if (!exists.contains(str)) {
                exists.add(str);
                need--;
                if (need == 0) {
                    return true;
                }
            }
        }
        return false;
    }

}
