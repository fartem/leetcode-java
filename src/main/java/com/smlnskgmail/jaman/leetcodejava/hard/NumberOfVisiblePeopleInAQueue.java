package com.smlnskgmail.jaman.leetcodejava.hard;

import java.util.Stack;

// https://leetcode.com/problems/number-of-visible-people-in-a-queue/
public class NumberOfVisiblePeopleInAQueue {

    private final int[] input;

    public NumberOfVisiblePeopleInAQueue(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        int length = input.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[input.length];
        for (int i = length - 1; i >= 0; i--) {
            int count = 0;
            int curr = input[i];
            while (!stack.isEmpty() && stack.peek() < curr) {
                count++;
                stack.pop();
            }
            result[i] = count + (stack.isEmpty() ? 0 : 1);
            stack.push(curr);
        }
        return result;
    }

}
