package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

public class MergeNodesInBetweenZeros {

    private final ListNode input;

    public MergeNodesInBetweenZeros(ListNode input) {
        this.input = input;
    }

    public ListNode solution() {
        ListNode rP = input.next;
        ListNode pP = input.next.next;
        while (pP.next != null) {
            if (pP.val != 0) {
                rP.val += pP.val;
            } else {
                rP.next = pP.next;
                rP = rP.next;
                pP = pP.next;
            }
            pP = pP.next;
        }
        rP.val += pP.val;
        rP.next = null;
        return input.next;
    }

}
