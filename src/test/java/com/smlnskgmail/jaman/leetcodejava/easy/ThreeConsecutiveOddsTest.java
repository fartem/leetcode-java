package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class ThreeConsecutiveOddsTest {

    @Test
    public void defaultTest() {
        assertFalse(
                new ThreeConsecutiveOdds(
                        new int[]{2, 6, 4, 1}
                ).solution()
        );
    }

}
