package com.smlnskgmail.jaman.leetcodejava.hard;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/merge-k-sorted-lists/
public class MergeKSortedLists {

    private final ListNode[] input;

    public MergeKSortedLists(ListNode[] input) {
        this.input = input;
    }

    public ListNode solution() {
        if (input.length == 0) {
            return null;
        }
        ListNode newHead = new ListNode();
        newHead.next = input[0];
        for (int i = 1; i < input.length; i++) {
            ListNode a = newHead.next;
            ListNode b = input[i];
            ListNode prev = newHead;
            while (a != null && b != null) {
                if (a.val >= b.val) {
                    prev.next = new ListNode(b.val);
                    prev.next.next = a;
                    b = b.next;
                    a = prev.next;
                    continue;
                }
                prev = a;
                a = a.next;
            }
            if (b != null) {
                prev.next = b;
            }
        }
        return newHead.next;
    }

}
