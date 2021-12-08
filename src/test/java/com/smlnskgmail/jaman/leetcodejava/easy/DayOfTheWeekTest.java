package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DayOfTheWeekTest {

    @Test
    public void defaultTest() {
        assertEquals(
                "Saturday",
                new DayOfTheWeek(31, 8, 2019).solution()
        );
    }

}
