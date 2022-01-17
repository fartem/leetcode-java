package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumDifferenceBetweenHighestAndLowestOfKScoresTest {

    @Test
    public void defaultTest() {
        assertEquals(
                0,
                new MinimumDifferenceBetweenHighestAndLowestOfKScores(new int[] {90}, 1)
                        .solution());
    }
}
