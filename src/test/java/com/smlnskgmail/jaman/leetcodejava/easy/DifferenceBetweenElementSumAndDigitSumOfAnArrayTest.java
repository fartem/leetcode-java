package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DifferenceBetweenElementSumAndDigitSumOfAnArrayTest {

    @Test
    public void defaultTests() {
        assertEquals(
                9,
                new DifferenceBetweenElementSumAndDigitSumOfAnArray(
                        new int[]{1, 15, 6, 3}
                ).solution()
        );
        assertEquals(
                0,
                new DifferenceBetweenElementSumAndDigitSumOfAnArray(
                        new int[]{1, 2, 3, 4,}
                ).solution()
        );
    }

}
