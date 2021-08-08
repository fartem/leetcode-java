package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SplitLinkedListIntPartsTest {

    @Test
    public void defaultTest() {
        ListNode head = new ListNode(
                1,
                new ListNode(
                        2,
                        new ListNode(3)
                )
        );
        ListNode[] correct = new ListNode[]{
                new ListNode(1),
                new ListNode(2),
                new ListNode(3),
                null,
                null
        };
        assertArrayEquals(
                correct,
                new SplitLinkedListIntParts(
                        head,
                        5
                ).solution()
        );
    }

}
