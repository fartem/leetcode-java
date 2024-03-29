package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Stack;

// https://leetcode.com/problems/simplify-path/
public class SimplifyPath {

    private final String input;

    public SimplifyPath(String input) {
        this.input = input;
    }

    public String solution() {
        Stack<String> stack = new Stack<>();
        String[] s = input.split("/");
        for (String str : s) {
            if (str.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!str.equals(".") && !str.equals("") && !str.equals(" ")) {
                stack.push("/" + str);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        return result.toString();
    }

}
