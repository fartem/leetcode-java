package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SwapNodesInPairsTest {

    @Test
    public void defaultTest() {
        ListNode correct = ListNode.fromNumbers(2, 1, 4, 3);
        ListNode solution = new SwapNodesInPairs(ListNode.fromNumbers(1, 2, 3, 4)).solution();
        assertTrue(ListNode.areEqual(correct, solution));
    }

}
