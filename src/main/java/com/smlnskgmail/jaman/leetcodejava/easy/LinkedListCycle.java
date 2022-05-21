package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/linked-list-cycle/
public class LinkedListCycle {

    private final ListNode input;

    public LinkedListCycle(ListNode input) {
        this.input = input;
    }

    public boolean solution() {
        if (input == null) {
            return false;
        }
        ListNode slow = input;
        ListNode fast = input.next;
        while (slow != fast) {
            if (fast == null && fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}
