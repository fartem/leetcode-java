package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

public class MaximumTwinSumOfLinkedList {

    private final ListNode input;

    public MaximumTwinSumOfLinkedList(ListNode input) {
        this.input = input;
    }

    public int solution() {
        ListNode slow = input;
        ListNode fast = input;
        ListNode firstPart = input;
        while (fast != null && fast.next != null) {
            firstPart = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode next;
        while (slow != null) {
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        firstPart.next = prev;
        int result = 0;
        ListNode f = input;
        ListNode s = firstPart.next;
        while (s != null) {
            result = Math.max(result, f.val + s.val);
            f = f.next;
            s = s.next;
        }
        return result;
    }

}
