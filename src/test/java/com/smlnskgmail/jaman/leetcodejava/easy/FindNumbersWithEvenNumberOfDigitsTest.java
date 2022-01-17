package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindNumbersWithEvenNumberOfDigitsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                2,
                new FindNumbersWithEvenNumberOfDigits(new int[] {12, 345, 2, 6, 7896}).solution());
    }
}
