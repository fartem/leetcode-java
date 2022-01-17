package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxConsecutiveOnesTest {

    @Test
    public void defaultTest() {
        assertEquals(3, new MaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1}).solution());
    }
}
