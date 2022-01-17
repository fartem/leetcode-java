package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/merge-two-sorted-lists
public class MergeTwoSortedLists {

    private final ListNode firstList;
    private final ListNode secondList;

    public MergeTwoSortedLists(ListNode firstList, ListNode secondList) {
        this.firstList = firstList;
        this.secondList = secondList;
    }

    public ListNode solution() {
        return merge(firstList, secondList);
    }

    private ListNode merge(ListNode firstList, ListNode secondList) {
        ListNode temp = new ListNode(0);
        ListNode current = temp;
        while (firstList != null && secondList != null) {
            if (firstList.val < secondList.val) {
                current.next = firstList;
                firstList = firstList.next;
            } else {
                current.next = secondList;
                secondList = secondList.next;
            }
            current = current.next;
        }
        if (firstList != null) {
            current.next = firstList;
        }
        if (secondList != null) {
            current.next = secondList;
        }
        return temp.next;
    }
}
