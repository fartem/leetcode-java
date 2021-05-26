package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Stack;

// https://leetcode.com/problems/daily-temperatures
public class DailyTemperatures {

    private final int[] input;

    public DailyTemperatures(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        int[] result = new int[input.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < input.length; i++) {
            while (!stack.empty() && input[i] > input[stack.peek()]) {
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }
        return result;
    }

}
