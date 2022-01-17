package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/swap-nodes-in-pairs
public class SwapNodesInPairs {

    private ListNode input;

    public SwapNodesInPairs(ListNode input) {
        this.input = input;
    }

    public ListNode solution() {
        if (input == null || input.next == null) {
            return input;
        }
        ListNode start = new ListNode(0, input);
        ListNode pointer = start;
        while (pointer.next != null && pointer.next.next != null) {
            ListNode post = pointer.next.next.next;
            ListNode last = pointer.next;
            pointer.next.next.next = pointer.next;
            pointer.next = pointer.next.next;
            last.next = post;
            pointer = last;
        }
        return start.next;
    }
}
