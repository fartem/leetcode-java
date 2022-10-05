package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumHoursOfTrainingToWinACompetitionTest {

    @Test
    public void defaultTest() {
        assertEquals(
                8,
                new MinimumHoursOfTrainingToWinACompetition(
                        5,
                        3,
                        new int[]{1, 4, 3, 2},
                        new int[]{2, 6, 3, 1}
                ).solution()
        );
    }

}
