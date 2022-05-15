package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DeleteTheMiddleNodeOfALinkedListTest {

    @Test
    public void defaultTest() {
        ListNode correct = ListNode.fromNumbers(1, 3, 4, 1, 2, 6);
        ListNode solution = new DeleteTheMiddleNodeOfALinkedList(
                ListNode.fromNumbers(1, 3, 4, 7, 1, 2, 6)
        ).solution();
        assertTrue(ListNode.areEqual(correct, solution));
    }

}
