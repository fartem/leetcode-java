package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/delete-node-in-a-linked-list
public class DeleteNodeInALinkedList {

    private final ListNode node;

    public DeleteNodeInALinkedList(ListNode node) {
        this.node = node;
    }

    public void solution() {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
