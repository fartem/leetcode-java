package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfStudentsUnableToEatLunchTest {

    @Test
    public void defaultTest() {
        assertEquals(
                0,
                new NumberOfStudentsUnableToEatLunch(
                        new int[]{1, 1, 0, 0},
                        new int[]{0, 1, 0, 1}
                ).solution()
        );
    }

}
