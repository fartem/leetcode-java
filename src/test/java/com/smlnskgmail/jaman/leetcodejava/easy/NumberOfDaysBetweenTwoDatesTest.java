package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberOfDaysBetweenTwoDatesTest {

    @Test
    public void defaultTest() {
        assertEquals(1, new NumberOfDaysBetweenTwoDates("2019-06-29", "2019-06-30").solution());
    }
}
