package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/ransom-note
public class RansomNote {

    private final String ransomNote;
    private final String magazine;

    public RansomNote(String ransomNote, String magazine) {
        this.ransomNote = ransomNote;
        this.magazine = magazine;
    }

    public boolean solution() {
        int[] letters = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            int index = magazine.charAt(i) - 97;
            letters[index] = letters[index] + 1;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 97;
            if (letters[index] != 0) {
                letters[index] = letters[index] - 1;
            } else {
                return false;
            }
        }
        return true;
    }
}
