package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/remove-linked-list-elements/
public class RemoveLinkedListElements {

    private ListNode head;
    private final int target;

    public RemoveLinkedListElements(ListNode head, int target) {
        this.head = head;
        this.target = target;
    }

    public ListNode solution() {
        while (head != null && head.val == target) {
            head = head.next;
        }
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == target) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

}
