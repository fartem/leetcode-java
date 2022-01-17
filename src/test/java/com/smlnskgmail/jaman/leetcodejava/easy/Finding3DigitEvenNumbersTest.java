package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Finding3DigitEvenNumbersTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[] {102, 120, 130, 132, 210, 230, 302, 310, 312, 320},
                new Finding3DigitEvenNumbers(new int[] {2, 1, 3, 0}).solution());
    }
}
