package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumCountOfPositiveIntegerAndNegativeIntegerTest {

    @Test
    public void defaultTests() {
        assertEquals(
                3,
                new MaximumCountOfPositiveIntegerAndNegativeInteger(
                        new int[]{-2, -1, -1, 1, 2, 3}
                ).solution()
        );
        assertEquals(
                3,
                new MaximumCountOfPositiveIntegerAndNegativeInteger(
                        new int[]{-3, -2, -1, 0, 0, 1, 2}
                ).solution()
        );
        assertEquals(
                4,
                new MaximumCountOfPositiveIntegerAndNegativeInteger(
                        new int[]{5, 20, 66, 1314}
                ).solution()
        );
    }

}
