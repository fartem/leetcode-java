package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DayOfTheWeekTest {

    @Test
    public void defaultTest() {
        assertEquals("Saturday", new DayOfTheWeek(31, 8, 2019).solution());
    }
}
