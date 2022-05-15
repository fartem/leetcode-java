package com.smlnskgmail.jaman.leetcodejava.hard;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MergeKSortedListsTest {

    @Test
    public void defaultTest() {
        assertTrue(
                ListNode.areEqual(
                        ListNode.fromNumbers(1, 1, 2, 3, 4, 4, 5, 6),
                        new MergeKSortedLists(
                                new ListNode[]{
                                        ListNode.fromNumbers(1, 4, 5),
                                        ListNode.fromNumbers(1, 3, 4),
                                        ListNode.fromNumbers(2, 6)
                                }
                        ).solution()
                )
        );
    }

}
