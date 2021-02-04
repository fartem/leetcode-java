package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PalindromeLinkedListTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new PalindromeLinkedList(
                        new ListNode(
                                1,
                                new ListNode(
                                        2,
                                        new ListNode(
                                                2,
                                                new ListNode(1)
                                        )
                                )
                        )
                ).solution()
        );
    }

}
