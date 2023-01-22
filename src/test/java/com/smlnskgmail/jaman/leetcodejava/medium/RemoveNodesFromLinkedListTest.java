package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RemoveNodesFromLinkedListTest {

    @Test
    public void defaultTests() {
        assertTrue(
                ListNode.areEqual(
                        ListNode.fromNumbers(13, 8),
                        new RemoveNodesFromLinkedList(
                                ListNode.fromNumbers(5, 2, 13, 3, 8)
                        ).solution()
                )
        );
        assertTrue(
                ListNode.areEqual(
                        ListNode.fromNumbers(1, 1, 1, 1),
                        new RemoveNodesFromLinkedList(
                                ListNode.fromNumbers(1, 1, 1, 1)
                        ).solution()
                )
        );
    }

}
