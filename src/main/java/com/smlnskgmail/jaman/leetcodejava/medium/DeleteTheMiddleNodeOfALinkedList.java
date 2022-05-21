package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
public class DeleteTheMiddleNodeOfALinkedList {

    private final ListNode input;

    public DeleteTheMiddleNodeOfALinkedList(ListNode input) {
        this.input = input;
    }

    public ListNode solution() {
        ListNode prev = null;
        ListNode slow = input;
        ListNode fast = input;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev == null) {
            return null;
        }
        prev.next = slow.next;
        return input;
    }

}
