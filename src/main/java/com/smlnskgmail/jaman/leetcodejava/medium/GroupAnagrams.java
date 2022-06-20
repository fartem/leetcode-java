package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.*;

// https://leetcode.com/problems/group-anagrams/
public class GroupAnagrams {

    private final String[] input;

    public GroupAnagrams(String[] input) {
        this.input = input;
    }

    public List<List<String>> solution() {
        Map<String, List<String>> values = new HashMap<>();
        for (String str : input) {
            char[] key = new char[str.length()];
            for (int i = 0; i < str.length(); i++) {
                key[i] = str.charAt(i);
            }
            Arrays.sort(key);
            String k = String.valueOf(key);
            if (values.containsKey(k)) {
                values.get(k).add(str);
            } else {
                List<String> value = new ArrayList<>();
                value.add(str);
                values.put(k, value);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (Map.Entry<String, List<String>> value : values.entrySet()) {
            result.add(value.getValue());
        }
        return result;
    }

}
