package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumSumOfFourDigitNumberAfterSplittingDigitsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                52,
                new MinimumSumOfFourDigitNumberAfterSplittingDigits(2932).solution()
        );
    }

}
