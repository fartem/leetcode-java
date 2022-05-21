package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/reorder-list/
public class ReorderList {

    private ListNode input;

    public ReorderList(ListNode input) {
        this.input = input;
    }

    public void solution() {
        ListNode tort = input;
        ListNode hare = input.next;
        while (hare != null && hare.next != null) {
            tort = tort.next;
            hare = hare.next.next;
        }
        ListNode fPart = input;
        ListNode sPart = tort.next;
        tort.next = null;
        sPart = reverse(sPart);

        ListNode temp = new ListNode();
        ListNode curr = temp;
        while (fPart != null || sPart != null) {
            if (fPart != null) {
                curr.next = fPart;
                curr = curr.next;
                fPart = fPart.next;
            }
            if (sPart != null) {
                curr.next = sPart;
                curr = curr.next;
                sPart = sPart.next;
            }
        }
        input = temp.next;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}
