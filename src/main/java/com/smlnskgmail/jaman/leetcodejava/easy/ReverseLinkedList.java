package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/reverse-linked-list
public class ReverseLinkedList {

    private final ListNode head;

    public ReverseLinkedList(ListNode head) {
        this.head = head;
    }

    public ListNode solution() {
        ListNode previous = null;
        ListNode current = head;
        ListNode next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}
