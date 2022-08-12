package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeArrayZeroBySubtractingEqualAmountsTest {

    @Test
    public void defaultTest() {
        assertEquals(
                3,
                new MakeArrayZeroBySubtractingEqualAmounts(
                        new int[]{1, 5, 0, 3, 5}
                ).solution()
        );
    }

}
