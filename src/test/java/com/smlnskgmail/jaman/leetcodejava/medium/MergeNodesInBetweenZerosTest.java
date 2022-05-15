package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MergeNodesInBetweenZerosTest {

    @Test
    public void defaultTest() {
        assertTrue(
                ListNode.areEqual(
                        ListNode.fromNumbers(4, 11),
                        new MergeNodesInBetweenZeros(
                                ListNode.fromNumbers(0, 3, 1, 0, 4, 5, 2, 0)
                        ).solution()
                )
        );
    }

}
