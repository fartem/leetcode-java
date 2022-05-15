package com.smlnskgmail.jaman.leetcodejava.hard;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ReverseNodesInKGroupTest {

    @Test
    public void defaultTest() {
        assertTrue(
                ListNode.areEqual(
                        ListNode.fromNumbers(2, 1, 4, 3, 5),
                        new ReverseNodesInKGroup(
                                ListNode.fromNumbers(1, 2, 3, 4, 5),
                                2
                        ).solution()
                )
        );
    }

}
