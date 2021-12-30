package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxConsecutiveOnesTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new MaxConsecutiveOnes(
                        new int[]{1, 1, 0, 1, 1, 1}
                ).solution()
        );
    }

}
