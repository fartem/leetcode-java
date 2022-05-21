package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Stack;

// https://leetcode.com/problems/132-pattern/
public class P132Pattern {

    private final int[] nums;

    public P132Pattern(int[] input) {
        this.nums = input;
    }

    public boolean solution() {
        int length = nums.length;
        int third = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for (int i = length - 1; i >= 0; i--) {
            int num = nums[i];
            if (num < third) {
                return true;
            }
            while (!stack.isEmpty() && num > stack.peek()) {
                third = stack.pop();
            }
            stack.push(num);
        }
        return false;
    }

}
