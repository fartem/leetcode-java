package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/isomorphic-strings/
public class IsomorphicStrings {

    private final String s;
    private final String t;

    public IsomorphicStrings(String s, String t) {
        this.s = s;
        this.t = t;
    }

    public boolean solution() {
        char[] replaces = new char[128];
        Set<Character> replaceValues = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char currS = s.charAt(i);
            char currT = t.charAt(i);
            if (replaces[currS] != 0) {
                char replacement = replaces[currS];
                if (currT != replacement) {
                    return false;
                }
            } else {
                if (replaceValues.contains(currT)) {
                    return false;
                }
                replaces[currS] = currT;
                replaceValues.add(currT);
            }
        }
        return true;
    }

}
