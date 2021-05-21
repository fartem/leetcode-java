package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnesTest {

    @Test
    public void defaultTest() {
        assertFalse(
                new CheckIfBinaryStringHasAtMostOneSegmentOfOnes(
                        "1001"
                ).solution()
        );
    }

}
