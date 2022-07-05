package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/decode-the-message/
public class DecodeTheMessage {

    private final String key;
    private final String message;

    public DecodeTheMessage(String key, String message) {
        this.key = key;
        this.message = message;
    }

    public String solution() {
        char[] table = new char[128];
        char original = 'a';
        for (int i = 0; i < key.length(); i++) {
            int curr = key.charAt(i);
            if (curr != ' ') {
                if (table[curr] == 0) {
                    table[curr] = original++;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char curr = message.charAt(i);
            if (curr != ' ') {
                result.append(table[curr] != 0 ? table[curr] : curr);
            } else {
                result.append(curr);
            }
        }
        return result.toString();
    }

}
