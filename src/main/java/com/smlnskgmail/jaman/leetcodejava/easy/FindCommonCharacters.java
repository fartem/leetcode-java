package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/find-common-characters/
public class FindCommonCharacters {

    private final String[] A;

    public FindCommonCharacters(String[] input) {
        this.A = input;
    }

    public List<String> solution() {
        if (A.length == 1) {
            return Collections.emptyList();
        }
        int[] common = new int[128];
        String firstString = A[0];
        for (int i = 0; i < firstString.length(); i++) {
            char c = firstString.charAt(i);
            if (common[c] != 0) {
                common[c] = common[c] + 1;
            } else {
                common[c] = 1;
            }
        }
        for (int i = 1; i < A.length; i++) {
            int[] letters = new int[128];
            String word = A[i];
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if (letters[c] != 0) {
                    letters[c] = letters[c] + 1;
                } else {
                    letters[c] = 1;
                }
            }
            for (int j = 0; j < common.length; j++) {
                common[j] = Math.min(common[j], letters[j]);
            }
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < common.length; i++) {
            if (common[i] != 0) {
                for (int j = 0; j < common[i]; j++) {
                    result.add(String.valueOf((char) i));
                }
            }
        }
        return result;
    }

}
