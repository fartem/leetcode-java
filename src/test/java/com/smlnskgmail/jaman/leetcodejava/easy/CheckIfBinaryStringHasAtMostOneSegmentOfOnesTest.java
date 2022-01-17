package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnesTest {

    @Test
    public void defaultTest() {
        assertFalse(new CheckIfBinaryStringHasAtMostOneSegmentOfOnes("1001").solution());
    }
}
