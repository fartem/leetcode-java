package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertBinaryNumberInALinkedListToIntegerTest {

    @Test
    public void defaultTest() {
        ListNode head = new ListNode(
                1,
                new ListNode(
                        0,
                        new ListNode(1)
                )
        );
        assertEquals(
                5,
                new ConvertBinaryNumberInALinkedListToInteger(
                        head
                ).solution()
        );
    }

}
