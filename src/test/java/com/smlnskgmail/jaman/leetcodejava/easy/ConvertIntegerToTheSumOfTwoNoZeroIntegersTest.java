package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ConvertIntegerToTheSumOfTwoNoZeroIntegersTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[] {2, 9}, new ConvertIntegerToTheSumOfTwoNoZeroIntegers(11).solution());
    }
}
