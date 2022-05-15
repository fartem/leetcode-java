package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumTwinSumOfLinkedListTest {

    @Test
    public void defaultTest() {
        assertEquals(
                6,
                new MaximumTwinSumOfLinkedList(ListNode.fromNumbers(5, 4, 2, 1)).solution()
        );
    }

}
