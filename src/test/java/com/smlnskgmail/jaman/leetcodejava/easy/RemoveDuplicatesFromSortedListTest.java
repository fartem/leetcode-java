package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedListTest {

    @Test
    public void defaultTest() {
        RemoveDuplicatesFromSortedList.ListNode validList = new RemoveDuplicatesFromSortedList.ListNode(
                1,
                new RemoveDuplicatesFromSortedList.ListNode(
                        2
                )
        );
        RemoveDuplicatesFromSortedList.ListNode head = new RemoveDuplicatesFromSortedList.ListNode(
                1,
                new RemoveDuplicatesFromSortedList.ListNode(
                        1,
                        new RemoveDuplicatesFromSortedList.ListNode(
                                2
                        )
                )
        );

        RemoveDuplicatesFromSortedList.ListNode pointer = validList;
        RemoveDuplicatesFromSortedList.ListNode result = new RemoveDuplicatesFromSortedList(
                head
        ).solution();
        while (pointer != null) {
            assertEquals(
                    pointer.val,
                    result.val
            );
            result = result.next;
            pointer = pointer.next;
        }
    }

}
