package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DayOfTheYearTest {

    @Test
    public void defaultTest() {
        assertEquals(9, new DayOfTheYear("2019-01-09").solution());
    }
}
