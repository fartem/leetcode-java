package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/add-two-numbers-ii
public class AddTwoNumbersII {

    private final ListNode l1;
    private final ListNode l2;

    public AddTwoNumbersII(ListNode l1, ListNode l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public ListNode solution() {
        ListNode r1 = reverse(l1);
        ListNode r2 = reverse(l2);
        ListNode sum = new ListNode();
        ListNode p = sum;
        int carry = 0;
        while (r1 != null || r2 != null) {
            int a = r1 != null ? r1.val : 0;
            int b = r2 != null ? r2.val : 0;
            int c = a + b + carry;
            p.next = new ListNode(c % 10);
            p = p.next;
            carry = c / 10;
            r1 = r1 != null ? r1.next : null;
            r2 = r2 != null ? r2.next : null;
        }
        if (carry != 0) {
            p.next = new ListNode(carry);
        }
        return reverse(sum.next);
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
