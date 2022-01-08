package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DetectPatternOfLengthMRepeatedKOrMoreTimesTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new DetectPatternOfLengthMRepeatedKOrMoreTimes(
                        new int[]{1, 2, 4, 4, 4, 4},
                        1,
                        3
                ).solution()
        );
    }

}
