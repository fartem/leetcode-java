package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DayOfTheYearTest {

    @Test
    public void defaultTest() {
        assertEquals(9, new DayOfTheYear("2019-01-09").solution());
    }

}
