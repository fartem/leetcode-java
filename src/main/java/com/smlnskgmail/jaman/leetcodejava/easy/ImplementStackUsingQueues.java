package com.smlnskgmail.jaman.leetcodejava.easy;

import java.util.LinkedList;

// https://leetcode.com/problems/implement-stack-using-queues/
public class ImplementStackUsingQueues {

    private final LinkedList<Integer> queue = new LinkedList<>();

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        return queue.removeLast();
    }

    public int top() {
        return queue.getLast();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

}
