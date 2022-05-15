package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ReverseNodesInEvenLengthGroupsTest {

    @Test
    public void defaultTest() {
        assertTrue(
                ListNode.areEqual(
                        ListNode.fromNumbers(5, 6, 2, 3, 9, 1, 4, 8, 3, 7),
                        new ReverseNodesInEvenLengthGroups(
                                ListNode.fromNumbers(5, 2, 6, 3, 9, 1, 7, 3, 8, 4)
                        ).solution()
                )
        );
    }

}
