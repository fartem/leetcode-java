package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/partition-list
public class PartitionList {

    private ListNode head;
    private final int x;

    public PartitionList(ListNode head, int x) {
        this.head = head;
        this.x = x;
    }

    public ListNode solution() {
        ListNode f = new ListNode();
        ListNode fP = f;
        ListNode s = new ListNode();
        ListNode sP = s;
        while (head != null) {
            if (head.val < x) {
                fP.next = new ListNode(head.val);
                fP = fP.next;
            } else {
                sP.next = new ListNode(head.val);
                sP = sP.next;
            }
            head = head.next;
        }
        fP.next = s.next;
        return f.next;
    }

}
