package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/reverse-linked-list-ii/
public class ReverseLinkedListII {

    private ListNode head;
    private int left;
    private int right;

    public ReverseLinkedListII(ListNode head, int left, int right) {
        this.head = head;
        this.left = left;
        this.right = right;
    }

    public ListNode solution() {
        if (head == null) {
            return null;
        }
        ListNode curr = head;
        ListNode prev = null;
        while (left > 1) {
            prev = curr;
            curr = curr.next;
            left--;
            right--;
        }
        ListNode con = prev;
        ListNode tail = curr;
        ListNode next;
        while (right > 0) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            right--;
        }
        if (con != null) {
            con.next = prev;
        } else {
            head = prev;
        }
        tail.next = curr;
        return head;
    }

}
