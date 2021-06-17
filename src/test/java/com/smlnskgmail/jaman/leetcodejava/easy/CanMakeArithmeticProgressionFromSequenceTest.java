package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CanMakeArithmeticProgressionFromSequenceTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new CanMakeArithmeticProgressionFromSequence(
                        new int[]{3, 5, 1}
                ).solution()
        );
    }

}
