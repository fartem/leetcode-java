package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

public class SwapNodesInPairsTest {

    @Test
    public void defaultTest() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode correct = new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3))));
        ListNode solution = new SwapNodesInPairs(head).solution();
        while (correct != null) {
            assertEquals(correct.val, solution.val);
            correct = correct.next;
            solution = solution.next;
        }
    }
}
