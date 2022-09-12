package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Stack;

// https://leetcode.com/problems/validate-stack-sequences/
public class ValidateStackSequences {

    private final int[] pushed;
    private final int[] popped;

    public ValidateStackSequences(int[] pushed, int[] popped) {
        this.pushed = pushed;
        this.popped = popped;
    }

    public boolean solution() {
        int n = pushed.length;
        Stack<Integer> stack = new Stack<>();
        int p = 0;
        for (int push : pushed) {
            stack.push(push);
            while (!stack.isEmpty() && p < n && stack.peek() == popped[p]) {
                stack.pop();
                p++;
            }
        }
        return p == n;
    }

}
