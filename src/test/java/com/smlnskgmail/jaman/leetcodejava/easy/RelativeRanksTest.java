package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RelativeRanksTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"},
                new RelativeRanks(
                        new int[]{5, 4, 3, 2, 1}
                ).solution()
        );
    }

}
