package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/camelcase-matching/
public class CamelcaseMatching {

    private final String[] queries;
    private final String pattern;

    public CamelcaseMatching(String[] queries, String pattern) {
        this.queries = queries;
        this.pattern = pattern;
    }

    public List<Boolean> solution() {
        List<Boolean> result = new ArrayList<>(queries.length);
        int pLength = pattern.length();
        for (String query : queries) {
            int p = 0;
            int i;
            for (i = 0; i < query.length(); i++) {
                char c = query.charAt(i);
                if (p >= pLength && c >= 'A' && c <= 'Z') {
                    break;
                }
                if (p < pLength && c == pattern.charAt(p)) {
                    p++;
                } else if (c >= 'A' && c <= 'Z' && c != pattern.charAt(p)) {
                    break;
                }
            }
            result.add(i == query.length() && p == pLength);
        }
        return result;
    }

}
