package com.smlnskgmail.jaman.leetcodejava.easy;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertBinaryNumberInALinkedListToIntegerTest {

    @Test
    public void defaultTest() {
        assertEquals(
                5,
                new ConvertBinaryNumberInALinkedListToInteger(
                        ListNode.fromNumbers(1, 0, 1)
                ).solution()
        );
    }

}
