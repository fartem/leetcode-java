package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SwappingNodesInALinkedListTest {

    @Test
    public void defaultTest() {
        ListNode correct = ListNode.fromNumbers(1, 4, 3, 2, 5);
        ListNode solution = new SwappingNodesInALinkedList(
                ListNode.fromNumbers(1, 2, 3, 4, 5),
                2
        ).solution();
        assertTrue(ListNode.areEqual(correct, solution));
    }

}
