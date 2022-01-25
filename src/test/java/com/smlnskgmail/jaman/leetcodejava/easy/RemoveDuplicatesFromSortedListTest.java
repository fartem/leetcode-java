package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RemoveDuplicatesFromSortedListTest {

    @Test
    public void defaultTest() {
        ListNode validList = ListNode.fromNumbers(1, 2);
        ListNode head = ListNode.fromNumbers(1, 1, 2);
        ListNode result = new RemoveDuplicatesFromSortedList(head).solution();
        assertTrue(
                ListNode.areEqual(
                        validList,
                        result
                )
        );
    }

}
