package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/linked-list-components/
public class LinkedListComponents {

    private ListNode head;
    private final int[] nums;

    public LinkedListComponents(ListNode head, int[] nums) {
        this.head = head;
        this.nums = nums;
    }

    public int solution() {
        Set<Integer> values = new HashSet<>();
        for (int num : nums) {
            values.add(num);
        }
        int result = 0;
        boolean isConnected = false;
        while (head != null) {
            if (values.contains(head.val)) {
                if (!isConnected) {
                    isConnected = true;
                    result++;
                }
            } else {
                isConnected = false;
            }
            head = head.next;
        }
        return result;
    }

}
