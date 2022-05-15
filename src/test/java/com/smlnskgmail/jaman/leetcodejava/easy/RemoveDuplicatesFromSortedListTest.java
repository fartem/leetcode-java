package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RemoveDuplicatesFromSortedListTest {

    @Test
    public void defaultTest() {
        ListNode correct = ListNode.fromNumbers(1, 2);
        ListNode solution = new RemoveDuplicatesFromSortedList(
                ListNode.fromNumbers(1, 1, 2)
        ).solution();
        assertTrue(ListNode.areEqual(correct, solution));
    }

}
