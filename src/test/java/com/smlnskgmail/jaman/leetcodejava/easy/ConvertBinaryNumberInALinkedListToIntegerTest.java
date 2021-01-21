package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertBinaryNumberInALinkedListToIntegerTest {

    @Test
    public void defaultTest() {
        ConvertBinaryNumberInALinkedListToInteger.ListNode head = new ConvertBinaryNumberInALinkedListToInteger.ListNode(
                1,
                new ConvertBinaryNumberInALinkedListToInteger.ListNode(
                        0,
                        new ConvertBinaryNumberInALinkedListToInteger.ListNode(1)
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
