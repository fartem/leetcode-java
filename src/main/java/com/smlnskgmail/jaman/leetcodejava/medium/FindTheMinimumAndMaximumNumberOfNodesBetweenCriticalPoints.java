package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;

// https://leetcode.com/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points
public class FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints {

    private final ListNode input;

    public FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints(ListNode input) {
        this.input = input;
    }

    public int[] solution() {
        ListNode prev = input;
        ListNode p = input.next;
        int index = 2;
        int firstIndex = -1;
        int prevIndex = -1;
        int min = Integer.MAX_VALUE;
        while (p != null && p.next != null) {
            if ((prev.val > p.val && p.next.val > p.val) || (prev.val < p.val && p.next.val < p.val)) {
                if (firstIndex == -1) {
                    firstIndex = index;
                }
                if (prevIndex != -1) {
                    min = Math.min(min, index - prevIndex);
                }
                prevIndex = index;
            }
            prev = p;
            p = p.next;
            index++;
        }
        return min != Integer.MAX_VALUE ? new int[]{min, prevIndex - firstIndex} : new int[]{-1, -1};
    }

}
