package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
public class RemoveDuplicatesFromSortedListII {

    private ListNode input;

    public RemoveDuplicatesFromSortedListII(ListNode input) {
        this.input = input;
    }

    public ListNode solution() {
        ListNode result = new ListNode(0, input);
        ListNode pred = result;
        while (input != null) {
            if (input.next != null && input.val == input.next.val) {
                while (input.next != null && input.val == input.next.val) {
                    input = input.next;
                }
                pred.next = input.next;
            } else {
                pred = pred.next;
            }
            input = input.next;
        }
        return result.next;
    }

}
