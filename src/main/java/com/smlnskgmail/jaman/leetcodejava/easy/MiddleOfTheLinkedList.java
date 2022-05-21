package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleOfTheLinkedList {

    private final ListNode head;

    public MiddleOfTheLinkedList(ListNode head) {
        this.head = head;
    }

    public ListNode solution() {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
