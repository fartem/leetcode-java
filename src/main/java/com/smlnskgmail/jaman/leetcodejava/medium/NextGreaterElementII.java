package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Stack;

// https://leetcode.com/problems/next-greater-element-ii/
public class NextGreaterElementII {

    private final int[] input;

    public NextGreaterElementII(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        int[] result = new int[input.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2 * input.length - 1; i >= 0; --i) {
            int index = i % input.length;
            while (!stack.empty() && input[stack.peek()] <= input[index]) {
                stack.pop();
            }
            result[index] = stack.empty() ? -1 : input[stack.peek()];
            stack.push(index);
        }
        return result;
    }

}
