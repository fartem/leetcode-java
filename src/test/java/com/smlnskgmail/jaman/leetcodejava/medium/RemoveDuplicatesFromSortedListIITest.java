package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RemoveDuplicatesFromSortedListIITest {

    @Test
    public void defaultTest() {
        ListNode correct = ListNode.fromNumbers(1, 2, 5);
        ListNode solution = new RemoveDuplicatesFromSortedListII(
                ListNode.fromNumbers(1, 2, 3, 3, 4, 4, 5)
        ).solution();
        assertTrue(ListNode.areEqual(correct, solution));
    }

}
