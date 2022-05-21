package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/
public class RemoveZeroSumConsecutiveNodesFromLinkedList {

    private final ListNode input;

    public RemoveZeroSumConsecutiveNodesFromLinkedList(ListNode input) {
        this.input = input;
    }

    public ListNode solution() {
        ListNode[] nodes = new ListNode[1000];
        ListNode p = input;
        int count = 0;
        while (p != null) {
            nodes[count++] = p;
            p = p.next;
        }
        for (int i = 0; i < count; i++) {
            int sum = 0;
            for (int j = i; j < count; j++) {
                sum += nodes[j].val;
                if (sum == 0) {
                    int k = i;
                    while (k <= j) {
                        nodes[k++] = null;
                    }
                    i = j;
                    break;
                }
            }
        }
        ListNode result = null;
        ListNode last = null;
        for (int i = 0; i < count; i++) {
            ListNode node = nodes[i];
            if (node != null) {
                if (result == null) {
                    result = node;
                    last = result;
                    result.next = null;
                } else {
                    last.next = node;
                    last = last.next;
                    last.next = null;
                }
            }
        }
        return result;
    }

}
