package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/keyboard-row
public class KeyboardRow {

    private final String[] input;

    public KeyboardRow(String[] input) {
        this.input = input;
    }

    public String[] solution() {
        String firstRow = "qwertyuiop";
        int[] first = new int[26];
        for (int i = 0; i < firstRow.length(); i++) {
            first[firstRow.charAt(i) - 97] = 1;
        }

        String secondRow = "asdfghjkl";
        int[] second = new int[26];
        for (int i = 0; i < secondRow.length(); i++) {
            second[secondRow.charAt(i) - 97] = 1;
        }

        String thirdRow = "zxcvbnm";
        int[] third = new int[26];
        for (int i = 0; i < thirdRow.length(); i++) {
            third[thirdRow.charAt(i) - 97] = 1;
        }

        List<String> result = new ArrayList<>();
        for (String word : input) {
            int c = Character.toLowerCase(word.charAt(0)) - 97;
            int[] row;
            if (first[c] == 1) {
                row = first;
            } else if (second[c] == 1) {
                row = second;
            } else {
                row = third;
            }
            boolean canType = true;
            for (int i = 1; i < word.length(); i++) {
                int l = Character.toLowerCase(word.charAt(i)) - 97;
                if (row[l] != 1) {
                    canType = false;
                    break;
                }
            }
            if (canType) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}
