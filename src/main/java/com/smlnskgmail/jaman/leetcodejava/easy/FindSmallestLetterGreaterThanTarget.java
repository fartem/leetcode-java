package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target
public class FindSmallestLetterGreaterThanTarget {

    private final char[] letters;
    private final char target;

    public FindSmallestLetterGreaterThanTarget(
            char[] letters,
            char target
    ) {
        this.letters = letters;
        this.target = target;
    }

    public char solution() {
        for (char c : letters) {
            if (c > target) {
                return c;
            }
        }
        return letters[0];
    }

}
