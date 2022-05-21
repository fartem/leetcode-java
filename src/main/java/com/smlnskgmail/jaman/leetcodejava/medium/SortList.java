package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/sort-list/
public class SortList {

    private final ListNode input;

    public SortList(ListNode input) {
        this.input = input;
    }

    public ListNode solution() {
        return sort(input);
    }

    private ListNode sort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        temp.next = null;

        ListNode left = sort(head);
        ListNode right = sort(slow);
        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode temp = new ListNode(0);
        ListNode current = temp;

        while (left != null && right != null) {
            if (left.val < right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        if (left != null) {
            current.next = left;
        }
        if (right != null) {
            current.next = right;
        }
        return temp.next;
    }

}
