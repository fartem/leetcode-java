package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ReverseLinkedListTest {

    @Test
    public void defaultTest() {
        ListNode validList = ListNode.fromNumbers(5, 4, 3, 2, 1);
        ListNode reversedList = new ReverseLinkedList(
                ListNode.fromNumbers(1, 2, 3, 4, 5)
        ).solution();
        assertTrue(ListNode.areEqual(validList, reversedList));
    }

}
