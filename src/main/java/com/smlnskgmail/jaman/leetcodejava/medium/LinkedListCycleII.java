package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/linked-list-cycle-ii
public class LinkedListCycleII {

    private final ListNode input;

    public LinkedListCycleII(ListNode input) {
        this.input = input;
    }

    public ListNode solution() {
        ListNode tort = input;
        ListNode hare = input;
        boolean isCycle = false;
        while (tort != null && hare != null && hare.next != null) {
            tort = tort.next;
            hare = hare.next.next;
            if (tort == hare) {
                isCycle = true;
                break;
            }
        }
        if (!isCycle) {
            return null;
        }
        tort = input;
        while (tort != hare) {
            tort = tort.next;
            hare = hare.next;
        }
        return tort;
    }

}
