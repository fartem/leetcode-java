package com.smlnskgmail.jaman.leetcodejava.medium;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class DailyTemperaturesTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[] {1, 1, 4, 2, 1, 1, 0, 0},
                new DailyTemperatures(new int[] {73, 74, 75, 71, 69, 72, 76, 73}).solution());
    }
}
