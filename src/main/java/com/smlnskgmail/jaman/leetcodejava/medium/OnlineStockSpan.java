package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.Stack;

// https://leetcode.com/problems/online-stock-span/
public class OnlineStockSpan {

    private final Stack<int[]> stack = new Stack<>();

    public int next(int price) {
        int result = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            result += stack.pop()[1];
        }
        stack.push(new int[]{price, result});
        return result;
    }

}
