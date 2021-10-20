package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

// https://leetcode.com/problems/min-stack
public class MinStack {

    private final Stack<Integer> stack = new Stack<>();
    private final Queue<Integer> orderedQueue = new PriorityQueue<>();

    public void push(int val) {
        stack.push(val);
        orderedQueue.add(val);
    }

    public void pop() {
        int val = stack.pop();
        orderedQueue.remove(val);
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return orderedQueue.peek();
    }

}
