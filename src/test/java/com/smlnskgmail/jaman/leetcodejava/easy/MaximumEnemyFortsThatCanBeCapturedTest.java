package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumEnemyFortsThatCanBeCapturedTest {

    @Test
    public void defaultTests() {
        assertEquals(
                4,
                new MaximumEnemyFortsThatCanBeCaptured(
                        new int[]{1, 0, 0, -1, 0, 0, 0, 0, 1}
                ).solution()
        );
        assertEquals(
                0,
                new MaximumEnemyFortsThatCanBeCaptured(
                        new int[]{0, 0, 1, -1}
                ).solution()
        );
    }

}
