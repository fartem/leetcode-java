package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OddEvenLinkedListTest {

    @Test
    public void defaultTest() {
        assertTrue(
                ListNode.areEqual(
                        new ListNode(
                                1,
                                new ListNode(
                                        3,
                                        new ListNode(
                                                5,
                                                new ListNode(
                                                        2,
                                                        new ListNode(4)
                                                )
                                        )
                                )
                        ),
                        new OddEvenLinkedList(
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
                        ).solution()
                )
        );
    }

}
