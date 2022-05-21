package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/merge-in-between-linked-lists/
public class MergeInBetweenLinkedLists {

    private final ListNode list1;
    private int a;
    private int b;
    private final ListNode list2;

    public MergeInBetweenLinkedLists(ListNode list1, int a, int b, ListNode list2) {
        this.list1 = list1;
        this.a = a;
        this.b = b;
        this.list2 = list2;
    }

    public ListNode solution() {
        ListNode nodeA = null;
        ListNode nodeB = null;
        ListNode pointer = list1;
        int count = 0;
        a--;
        b++;
        while (pointer != null) {
            if (count == a) {
                nodeA = pointer;
            } else if (count == b) {
                nodeB = pointer;
            }
            count++;
            pointer = pointer.next;
        }
        if (nodeA == null) {
            return list1;
        }
        nodeA.next = list2;
        if (nodeB != null) {
            pointer = list2;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = nodeB;
        }
        return list1;
    }

}
