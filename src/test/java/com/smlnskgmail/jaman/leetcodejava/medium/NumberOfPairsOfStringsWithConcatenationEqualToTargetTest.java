package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfPairsOfStringsWithConcatenationEqualToTargetTest {

    @Test
    public void defaultTest() {
        assertEquals(
                4,
                new NumberOfPairsOfStringsWithConcatenationEqualToTarget(
                        new String[]{"777", "7", "77", "77"},
                        "7777"
                ).solution()
        );
    }

}
