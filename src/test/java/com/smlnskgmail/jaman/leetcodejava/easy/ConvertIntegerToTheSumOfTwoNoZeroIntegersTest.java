package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ConvertIntegerToTheSumOfTwoNoZeroIntegersTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{2, 9},
                new ConvertIntegerToTheSumOfTwoNoZeroIntegers(11).solution()
        );
    }

}
