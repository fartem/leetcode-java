package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer
public class ConvertBinaryNumberInALinkedListToInteger {

    private ListNode head;

    public ConvertBinaryNumberInALinkedListToInteger(ListNode head) {
        this.head = head;
    }

    public int solution() {
        int result = head.val;
        while (head.next != null) {
            result = result * 2 + head.next.val;
            head = head.next;
        }
        return result;
    }
}
