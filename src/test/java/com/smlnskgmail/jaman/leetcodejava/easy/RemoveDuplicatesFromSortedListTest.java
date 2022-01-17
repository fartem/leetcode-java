package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

public class RemoveDuplicatesFromSortedListTest {

    @Test
    public void defaultTest() {
        ListNode validList = new ListNode(1, new ListNode(2));
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2)));

        ListNode pointer = validList;
        ListNode result = new RemoveDuplicatesFromSortedList(head).solution();
        while (pointer != null) {
            assertEquals(pointer.val, result.val);
            result = result.next;
            pointer = pointer.next;
        }
    }
}
