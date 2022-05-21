package com.smlnskgmail.jaman.leetcodejava.medium;

import java.util.LinkedList;

// https://leetcode.com/problems/design-front-middle-back-queue/
public class DesignFrontMiddleBackQueue {

    private final LinkedList<Integer> list = new LinkedList<>();

    public void pushFront(int val) {
        list.addFirst(val);
    }

    public void pushMiddle(int val) {
        list.add(list.size() / 2, val);
    }

    public void pushBack(int val) {
        list.addLast(val);
    }

    public int popFront() {
        return !list.isEmpty() ? list.pollFirst() : -1;
    }

    public int popMiddle() {
        int size = list.size();
        if (size == 0) {
            return -1;
        }
        int index = size % 2 == 0 ? size / 2 - 1 : size / 2;
        return list.remove(index);
    }

    public int popBack() {
        return !list.isEmpty() ? list.pollLast() : -1;
    }

}
