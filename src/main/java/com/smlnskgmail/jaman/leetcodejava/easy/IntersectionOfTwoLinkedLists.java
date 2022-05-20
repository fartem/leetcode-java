package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

//https://leetcode.com/problems/intersection-of-two-linked-lists/
public class IntersectionOfTwoLinkedLists {

    private final ListNode firstHead;
    private final ListNode secondHead;

    public IntersectionOfTwoLinkedLists(ListNode firstHead, ListNode secondHead) {
        this.firstHead = firstHead;
        this.secondHead = secondHead;
    }

    public ListNode solution() {
        ListNode pointerA = firstHead;
        ListNode pointerB = secondHead;
        while (pointerA != pointerB) {
            if (pointerA == null) {
                pointerA = secondHead;
            } else {
                pointerA = pointerA.next;
            }
            if (pointerB == null) {
                pointerB = firstHead;
            } else {
                pointerB = pointerB.next;
            }
        }
        return pointerA;
    }

}
