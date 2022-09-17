package com.smlnskgmail.jaman.leetcodejava.hard;

import java.util.*;

// https://leetcode.com/problems/palindrome-pairs/
public class PalindromePairs {

    private final String[] input;

    public PalindromePairs(String[] input) {
        this.input = input;
    }

    public List<List<Integer>> solution() {
        Map<String, Integer> map = new HashMap<>();
        Set<Integer> set = new TreeSet<>();
        int n = input.length;
        for (int i = 0; i < n; i++) {
            String curr = input[i];
            map.put(curr, i);
            set.add(curr.length());
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String curr = input[i];
            int l = curr.length();
            if (l == 1) {
                if (map.containsKey("")) {
                    result.add(Arrays.asList(i, map.get("")));
                    result.add(Arrays.asList(map.get(""), i));
                    continue;
                }
            }
            String rev = new StringBuilder(curr).reverse().toString();
            if (map.getOrDefault(rev, i) != i) {
                result.add(Arrays.asList(i, map.get(rev)));
            }
            for (int j : set) {
                if (j == l) {
                    break;
                }
                if (isPalindrome(rev, 0, l - 1 - j)) {
                    String s = rev.substring(l - j);
                    if (map.containsKey(s)) {
                        result.add(Arrays.asList(i, map.get(s)));
                    }
                }
                if (isPalindrome(rev, j, l - 1)) {
                    String s = rev.substring(0, j);
                    if (map.containsKey(s)) {
                        result.add(Arrays.asList(map.get(s), i));
                    }
                }
            }
        }
        return result;
    }

    private boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) {
                return false;
            }
        }
        return true;
    }

}
