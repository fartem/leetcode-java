package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DetectPatternOfLengthMRepeatedKOrMoreTimesTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new DetectPatternOfLengthMRepeatedKOrMoreTimes(new int[] {1, 2, 4, 4, 4, 4}, 1, 3)
                        .solution());
    }
}
