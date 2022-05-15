package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleOfTheLinkedListTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new MiddleOfTheLinkedList(ListNode.fromNumbers(1, 2, 3, 4, 5)).solution().val
        );
    }

}
