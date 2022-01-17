package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumProductOfThreeNumbersTest {

    @Test
    public void defaultTest() {
        assertEquals(6, new MaximumProductOfThreeNumbers(new int[] {1, 2, 3}).solution());
    }
}
