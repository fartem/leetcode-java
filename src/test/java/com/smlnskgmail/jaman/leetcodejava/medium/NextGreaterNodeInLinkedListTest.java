package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NextGreaterNodeInLinkedListTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{5, 5, 0},
                new NextGreaterNodeInLinkedList(
                        new ListNode(
                                2,
                                new ListNode(
                                        1,
                                        new ListNode(5)
                                )
                        )
                ).solution()
        );
    }

}
