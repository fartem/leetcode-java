package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CheckIfAllTheIntegersInARangeAreCoveredTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new CheckIfAllTheIntegersInARangeAreCovered(
                        new int[][]{{1, 2}, {3, 4}, {5, 6}},
                        2,
                        5
                ).solution()
        );
    }

}
