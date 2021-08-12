package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/add-two-numbers
public class AddTwoNumbers {

    private ListNode l1;
    private ListNode l2;

    public AddTwoNumbers(ListNode l1, ListNode l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public ListNode solution() {
        ListNode sum = new ListNode();
        ListNode p = sum;
        int add = 0;
        while (l1 != null && l2 != null) {
            int a = l1.val;
            int b = l2.val;
            int s = a + b + add;
            if (s > 9) {
                s -= 10;
                add = 1;
            } else {
                add = 0;
            }
            p.next = new ListNode(s);
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null) {
            while (l1 != null) {
                int s = l1.val + add;
                if (s > 9) {
                    s -= 10;
                    add = 1;
                } else {
                    add = 0;
                }
                p.next = new ListNode(s);
                p = p.next;
                l1 = l1.next;
            }
        } else if (l2 != null) {
            while (l2 != null) {
                int s = l2.val + add;
                if (s > 9) {
                    s -= 10;
                    add = 1;
                } else {
                    add = 0;
                }
                p.next = new ListNode(s);
                p = p.next;
                l2 = l2.next;
            }
        }
        if (add == 1) {
            p.next = new ListNode(1);
        }
        return sum.next;
    }

}
