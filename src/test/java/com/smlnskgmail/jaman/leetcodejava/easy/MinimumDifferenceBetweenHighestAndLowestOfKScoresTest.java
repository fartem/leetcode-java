package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumDifferenceBetweenHighestAndLowestOfKScoresTest {

    @Test
    public void defaultTest() {
        assertEquals(
                0,
                new MinimumDifferenceBetweenHighestAndLowestOfKScores(
                        new int[]{90},
                        1
                ).solution()
        );
    }

}
