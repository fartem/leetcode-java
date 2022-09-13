package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.ArrayDeque;
import java.util.Deque;

// https://leetcode.com/problems/construct-smallest-number-from-di-string/
public class ConstructSmallestNumberFromDIString {

    private final String input;

    public ConstructSmallestNumberFromDIString(String input) {
        this.input = input;
    }

    public String solution() {
        char[] letters = new char[input.length()];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = input.charAt(i);
        }
        Deque<Integer> s1 = new ArrayDeque<>();
        Deque<Integer> s2 = new ArrayDeque<>();
        for (int i = 0; i < letters.length; i++) {
            char letter = letters[i];
            if (letter == 'I') {
                s1.addLast(i + 1);
                while (!s2.isEmpty()) {
                    s1.addLast(s2.pollLast());
                }
            } else {
                s2.addLast(i + 1);
            }
        }
        s1.addLast(letters.length + 1);
        while (!s2.isEmpty()) {
            s1.addLast(s2.pollLast());
        }
        var result = new StringBuilder();
        for (int num : s1) {
            result.append(num);
        }
        return result.toString();
    }

}
