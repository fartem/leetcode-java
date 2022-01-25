package com.smlnskgmail.jaman.leetcodejava.hard;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MergeKSortedListsTest {

    @Test
    public void defaultTest() {
        assertTrue(
                ListNode.areEqual(
                        ListNode.fromArray(new int[]{1, 1, 2, 3, 4, 4, 5, 6}),
                        new MergeKSortedLists(
                                new ListNode[]{
                                        ListNode.fromArray(new int[]{1, 4, 5}),
                                        ListNode.fromArray(new int[]{1, 3, 4}),
                                        ListNode.fromArray(new int[]{2, 6})
                                }
                        ).solution()
                )
        );
        assertTrue(
                ListNode.areEqual(
                        ListNode.fromArray(new int[]{-1, 5, 6, 10, 11}),
                        new MergeKSortedLists(
                                new ListNode[]{
                                        ListNode.fromArray(new int[]{-1, 5, 11}),
                                        ListNode.fromArray(new int[]{6, 10})
                                }
                        ).solution()
                )
        );
    }

}
