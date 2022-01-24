package com.smlnskgmail.jaman.leetcodejava.hard;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/reverse-nodes-in-k-group
public class ReverseNodesInKGroup {

    private final ListNode head;
    private final int k;

    public ReverseNodesInKGroup(ListNode head, int k) {
        this.head = head;
        this.k = k;
    }

    public ListNode solution() {
        return reverse(head, k);
    }

    private ListNode reverse(ListNode head, int k) {
        if (head != null) {
            ListNode prev = null;
            if (hasNext(head, k)) {
                ListNode curr = head;
                ListNode next = null;
                int count = 0;
                while (curr != null && count++ < k) {
                    next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                }
                head.next = reverse(next, k);
            } else {
                return head;
            }
            return prev;
        }
        return null;
    }

    private boolean hasNext(ListNode head, int k) {
        int count = 0;
        ListNode p = head;
        while (count != k && p != null) {
            p = p.next;
            count++;
        }
        return count == k;
    }

}
