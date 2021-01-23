package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleOfTheLinkedListTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new MiddleOfTheLinkedList(
                        new ListNode(
                                1,
                                new ListNode(
                                        2,
                                        new ListNode(
                                                3,
                                                new ListNode(
                                                        4,
                                                        new ListNode(5)
                                                )
                                        )
                                )
                        )
                ).solution().val
        );
    }

}
