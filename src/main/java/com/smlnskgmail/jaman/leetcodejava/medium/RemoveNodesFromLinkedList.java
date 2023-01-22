package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/remove-nodes-from-linked-list/
public class RemoveNodesFromLinkedList {

    private final ListNode input;

    public RemoveNodesFromLinkedList(ListNode input) {
        this.input = input;
    }

    public ListNode solution() {
        return removeNodes(input);
    }

    private ListNode removeNodes(ListNode head) {
        if (head == null) {
            return null;
        }
        head.next = removeNodes(head.next);
        return head.next != null && head.val < head.next.val ? head.next : head;
    }

}
