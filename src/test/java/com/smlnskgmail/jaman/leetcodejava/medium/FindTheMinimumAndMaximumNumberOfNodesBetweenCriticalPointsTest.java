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
                        ListNode.fromNumbers(1, 3)
                ).solution()
        );
    }

}
