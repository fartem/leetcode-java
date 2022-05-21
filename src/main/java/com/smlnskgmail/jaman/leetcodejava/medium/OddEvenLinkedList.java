package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/odd-even-linked-list/
public class OddEvenLinkedList {

    private final ListNode input;

    public OddEvenLinkedList(ListNode input) {
        this.input = input;
    }

    public ListNode solution() {
        if (input == null) {
            return null;
        }
        ListNode odd = input;
        ListNode even = input.next;
        ListNode evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return input;
    }

}
