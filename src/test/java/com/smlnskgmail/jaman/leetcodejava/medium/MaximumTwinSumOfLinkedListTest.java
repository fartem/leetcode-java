package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumTwinSumOfLinkedListTest {

    @Test
    public void defaultTest() {
        assertEquals(
                6,
                new MaximumTwinSumOfLinkedList(
                        new ListNode(
                                5,
                                new ListNode(
                                        4,
                                        new ListNode(
                                                2,
                                                new ListNode(1)
                                        )
                                )
                        )
                ).solution()
        );
    }

}
