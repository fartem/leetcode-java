package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OddEvenLinkedListTest {

    @Test
    public void defaultTest() {
        assertTrue(
                ListNode.areEqual(
                        ListNode.fromNumbers(1, 3, 5, 2, 4),
                        new OddEvenLinkedList(ListNode.fromNumbers(1, 2, 3, 4, 5)).solution()
                )
        );
    }

}
