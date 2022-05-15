package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/letter-case-permutation
public class LetterCasePermutation {

    private final String s;

    public LetterCasePermutation(String input) {
        this.s = input;
    }

    public List<String> solution() {
        List<String> result = new ArrayList<>();
        findPermutations(s.toCharArray(), 0, result);
        return result;
    }

    private void findPermutations(
            char[] arr,
            int index,
            List<String> result
    ) {
        if (index == arr.length) {
            result.add(new String(arr));
            return;
        }
        if (Character.isDigit(arr[index])) {
            findPermutations(arr, index + 1, result);
        } else {
            arr[index] = Character.toLowerCase(arr[index]);
            findPermutations(arr, index + 1, result);

            arr[index] = Character.toUpperCase(arr[index]);
            findPermutations(arr, index + 1, result);
        }
    }

}
