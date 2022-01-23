package com.smlnskgmail.jaman.leetcodejava.medium;

import com.smlnskgmail.jaman.leetcodejava.support.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPointsTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{-1, -1},
                new FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints(
                        new ListNode(1, new ListNode(3))
                ).solution()
        );
        assertArrayEquals(
                new int[]{1, 3},
                new FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints(
                        new ListNode(
                                5,
                                new ListNode(
                                        3,
                                        new ListNode(
                                                1,
                                                new ListNode(
                                                        2,
                                                        new ListNode(
                                                                5,
                                                                new ListNode(
                                                                        1,
                                                                        new ListNode(2)
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                ).solution()
        );
    }

}
