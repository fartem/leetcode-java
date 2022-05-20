package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Stack;

// https://leetcode.com/problems/backspace-string-compare/
public class BackspaceStringCompare {

    private final String s;
    private final String t;

    public BackspaceStringCompare(String s, String t) {
        this.s = s;
        this.t = t;
    }

    public boolean solution() {
        Stack<Character> f = printChars(s);
        Stack<Character> n = printChars(t);
        if (f.size() != n.size()) {
            return false;
        }
        for (int i = 0; i < f.size(); i++) {
            char fC = f.get(i);
            char nC = n.get(i);
            if (fC != nC) {
                return false;
            }
        }
        return true;
    }

    private Stack<Character> printChars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        return stack;
    }

}
