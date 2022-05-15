package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PartitionListTest {

    @Test
    public void defaultTest() {
        ListNode head = ListNode.fromNumbers(1, 4, 3, 2, 5, 2);
        ListNode correct = ListNode.fromNumbers(1, 2, 2, 4, 3, 5);
        ListNode solution = new PartitionList(head, 3).solution();
        assertTrue(ListNode.areEqual(correct, solution));
    }

}
