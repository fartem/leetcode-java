package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RemoveNthNodeFromEndOfListTest {

    @Test
    public void defaultTest() {
        ListNode correct = ListNode.fromNumbers(1, 2, 3, 5);
        ListNode solution = new RemoveNthNodeFromEndOfList(
                ListNode.fromNumbers(1, 2, 3, 4, 5),
                2
        ).solution();
        assertTrue(ListNode.areEqual(correct, solution));
    }

}
