package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfDaysBetweenTwoDatesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new NumberOfDaysBetweenTwoDates(
                        "2019-06-29",
                        "2019-06-30"
                ).solution()
        );
    }

}
