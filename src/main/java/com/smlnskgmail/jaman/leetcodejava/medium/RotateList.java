package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/rotate-list
public class RotateList {

    private ListNode head;
    private final int k;

    public RotateList(ListNode head, int k) {
        this.head = head;
        this.k = k;
    }

    public ListNode solution() {
        int size = 0;
        ListNode p = head;
        while (p != null) {
            p = p.next;
            size++;
        }
        if (size < 2 || size == k) {
            return head;
        }
        int places = k > size ? k % size : k;
        if (places == 0) {
            return head;
        }
        ListNode div = head;
        for (int i = 0; i < size - places - 1; i++) {
            div = div.next;
        }
        ListNode oldHead = head;
        head = div.next;
        div.next = null;
        ListNode last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = oldHead;
        return head;
    }

}
