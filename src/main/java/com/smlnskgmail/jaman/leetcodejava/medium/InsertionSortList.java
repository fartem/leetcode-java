package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/insertion-sort-list/
public class InsertionSortList {

    private final ListNode input;

    public InsertionSortList(ListNode input) {
        this.input = input;
    }

    public ListNode solution() {
        ListNode result = new ListNode();
        ListNode curr = input;
        while (curr != null) {
            ListNode prev = result;
            while (prev.next != null && prev.next.val <= curr.val) {
                prev = prev.next;
            }
            ListNode next = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = next;
        }
        return result.next;
    }

}
