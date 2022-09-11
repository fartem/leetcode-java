package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumTwinSumOfALinkedListTest {

    @Test
    public void defaultTest() {
        assertEquals(
                6,
                new MaximumTwinSumOfALinkedList(ListNode.fromNumbers(5, 4, 2, 1)).solution()
        );
    }

}
