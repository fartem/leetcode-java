package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertNull;

public class RemoveZeroSumConsecutiveNodesFromLinkedListTest {

    @Test
    public void defaultTest() {
        assertNull(
                new RemoveZeroSumConsecutiveNodesFromLinkedList(
                        ListNode.fromNumbers(0, 1, -1)
                ).solution()
        );
    }

}
