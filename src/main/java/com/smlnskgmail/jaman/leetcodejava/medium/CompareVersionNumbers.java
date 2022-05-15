package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/compare-version-numbers
public class CompareVersionNumbers {

    private final String version1;
    private final String version2;

    public CompareVersionNumbers(String version1, String version2) {
        this.version1 = version1;
        this.version2 = version2;
    }

    public int solution() {
        List<Integer> v1 = parts(version1);
        List<Integer> v2 = parts(version2);
        int p = 0;
        while (p < v1.size() && p < v2.size()) {
            if (v1.get(p) > v2.get(p)) {
                return 1;
            } else if (v1.get(p) < v2.get(p)) {
                return -1;
            }
            p++;
        }
        if (v1.size() != p && !hasOnlyZeros(v1, p)) {
            return 1;
        }
        if (v2.size() != p && !hasOnlyZeros(v2, p)) {
            return -1;
        }
        return 0;
    }

    private List<Integer> parts(String version) {
        List<Integer> parts = new ArrayList<>();
        for (String part : version.split("\\.")) {
            int start = 0;
            while (start < part.length() - 1 && part.charAt(start) == '0') {
                start++;
            }
            parts.add(Integer.parseInt(part.substring(start)));
        }
        return parts;
    }

    private boolean hasOnlyZeros(List<Integer> parts, int p) {
        while (p < parts.size()) {
            if (parts.get(p) != 0) {
                return false;
            }
            p++;
        }
        return true;
    }

}
