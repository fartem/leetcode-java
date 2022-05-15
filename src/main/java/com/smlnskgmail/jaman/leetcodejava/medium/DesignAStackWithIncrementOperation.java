package com.smlnskgmail.jaman.leetcodejava.medium;

// https://leetcode.com/problems/design-a-stack-with-increment-operation
public class DesignAStackWithIncrementOperation {

    private final int[] stack;
    private final int maxSize;
    private int size;

    public DesignAStackWithIncrementOperation(int maxSize) {
        this.stack = new int[maxSize];
        this.maxSize = maxSize;
    }

    public void push(int x) {
        if (size < maxSize) {
            stack[size++] = x;
        }
    }

    public int pop() {
        if (size > 0) {
            return stack[--size];
        }
        return -1;
    }

    public void increment(int k, int val) {
        if (size < k) {
            for (int i = 0; i < size; i++) {
                stack[i] += val;
            }
        } else {
            int p = 0;
            while (k-- > 0) {
                stack[p++] += val;
            }
        }
    }

}
