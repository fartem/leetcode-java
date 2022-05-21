package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// https://leetcode.com/problems/next-greater-node-in-linked-list/
public class NextGreaterNodeInLinkedList {

    private final ListNode input;

    public NextGreaterNodeInLinkedList(ListNode input) {
        this.input = input;
    }

    public int[] solution() {
        List<Integer> nodes = new ArrayList<>();
        ListNode pointer = input;
        while (pointer != null) {
            nodes.add(pointer.val);
            pointer = pointer.next;
        }
        int[] result = new int[nodes.size()];
        Deque<Integer> values = new ArrayDeque<>();
        for (int i = 0; i < nodes.size(); i++) {
            while (!values.isEmpty() && nodes.get(i) > nodes.get(values.peek())) {
                result[values.pop()] = nodes.get(i);
            }
            values.push(i);
        }
        return result;
    }

}
