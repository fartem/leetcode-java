package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/split-linked-list-in-parts
public class SplitLinkedListIntParts {

    private final ListNode head;
    private final int k;

    public SplitLinkedListIntParts(ListNode head, int k) {
        this.head = head;
        this.k = k;
    }

    public ListNode[] solution() {
        ListNode p = head;
        int count = 0;
        while (p != null) {
            p = p.next;
            count++;
        }
        int part = count / k;
        int remainder = count % k;
        ListNode[] result = new ListNode[k];
        p = head;
        for (int i = 0; i < k; i++) {
            ListNode unit = new ListNode(0);
            ListNode curr = unit;
            for (int j = 0; j < part + (i < remainder ? 1 : 0); j++) {
                if (p != null) {
                    curr = curr.next = new ListNode(p.val);
                    p = p.next;
                }
            }
            result[i] = unit.next;
        }
        return result;
    }

}
