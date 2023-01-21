package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class InsertionSortListTest {

    @Test
    public void defaultTests() {
        assertTrue(
                ListNode.areEqual(
                        ListNode.fromNumbers(1, 2, 3, 4),
                        new InsertionSortList(
                                ListNode.fromNumbers(4, 2, 1, 3)
                        ).solution()
                )
        );
        assertTrue(
                ListNode.areEqual(
                        ListNode.fromNumbers(-1, 0, 3, 4, 5),
                        new InsertionSortList(
                                ListNode.fromNumbers(-1, 5, 3, 4, 0)
                        ).solution()
                )
        );
    }

}
