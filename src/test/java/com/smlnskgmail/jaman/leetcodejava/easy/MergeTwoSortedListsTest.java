package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MergeTwoSortedListsTest {

    @Test
    public void defaultTest() {
        ListNode validList = ListNode.fromNumbers(1, 2, 3, 4);
        ListNode mergedList = new MergeTwoSortedLists(
                ListNode.fromNumbers(1, 2, 4),
                ListNode.fromNumbers(1, 3, 4)
        ).solution();
        assertTrue(
                ListNode.areEqual(
                        validList,
                        mergedList
                )
        );
    }

}
