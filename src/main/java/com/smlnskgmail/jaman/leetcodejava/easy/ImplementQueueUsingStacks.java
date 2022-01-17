package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.Stack;

// https://leetcode.com/problems/implement-queue-using-stacks
public class ImplementQueueUsingStacks {

    private final Stack<Integer> stack = new Stack<>();

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }
        int element = tempStack.pop();
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
        return element;
    }

    public int peek() {
        return stack.get(0);
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
