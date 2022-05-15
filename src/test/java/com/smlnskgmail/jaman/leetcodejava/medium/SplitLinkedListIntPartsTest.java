package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SplitLinkedListIntPartsTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new ListNode[]{
                        new ListNode(1),
                        new ListNode(2),
                        new ListNode(3),
                        null,
                        null
                },
                new SplitLinkedListIntParts(
                        ListNode.fromNumbers(1, 2, 3),
                        5
                ).solution()
        );
    }

}
