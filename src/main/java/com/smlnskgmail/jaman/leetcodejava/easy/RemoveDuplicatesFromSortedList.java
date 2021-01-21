package com.smlnskgmail.jaman.leetcodejava.easy;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list
public class RemoveDuplicatesFromSortedList {

    private final ListNode head;

    public RemoveDuplicatesFromSortedList(ListNode head) {
        this.head = head;
    }

    public ListNode solution() {
        ListNode pointer = head;
        while (pointer != null && pointer.next != null) {
            if (pointer.val == pointer.next.val) {
                pointer.next = pointer.next.next;
            } else {
                pointer = pointer.next;
            }
        }
        return head;
    }

    public static class ListNode {

        int val;
        ListNode next;

        public ListNode() {

        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

}
