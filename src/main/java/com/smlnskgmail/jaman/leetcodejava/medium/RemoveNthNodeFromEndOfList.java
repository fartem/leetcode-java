package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list
public class RemoveNthNodeFromEndOfList {

    private ListNode head;
    private final int n;

    public RemoveNthNodeFromEndOfList(
            ListNode head,
            int n
    ) {
        this.head = head;
        this.n = n;
    }

    public ListNode solution() {
        List<ListNode> nodes = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            nodes.add(curr);
            curr = curr.next;
        }
        int index = nodes.size() - n;
        ListNode prev = index == 0 ? null : nodes.get(index - 1);
        ListNode next = index == nodes.size() - 1 ? null : nodes.get(index + 1);
        if (prev != null) {
            prev.next = next;
        } else {
            head = next;
        }
        return head;
    }

}
