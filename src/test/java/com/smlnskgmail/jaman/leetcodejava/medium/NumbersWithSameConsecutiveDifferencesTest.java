package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NumbersWithSameConsecutiveDifferencesTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{181, 292, 707, 818, 929},
                new NumbersWithSameConsecutiveDifferences(3, 7).solution()
        );
    }

}
