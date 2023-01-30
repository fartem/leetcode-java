package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ApplyOperationsToAnArrayTest {

    @Test
    public void defaultTests() {
        assertArrayEquals(
                new int[]{1, 4, 2, 0, 0, 0},
                new ApplyOperationsToAnArray(
                        new int[]{1, 2, 2, 1, 1, 0}
                ).solution()
        );
        assertArrayEquals(
                new int[]{1, 0},
                new ApplyOperationsToAnArray(
                        new int[]{0, 1}
                ).solution()
        );
    }

}
