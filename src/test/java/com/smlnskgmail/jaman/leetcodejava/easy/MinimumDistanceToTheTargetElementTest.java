package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumDistanceToTheTargetElementTest {

    @Test
    public void defaultTest() {
        assertEquals(
                1,
                new MinimumDistanceToTheTargetElement(
                        new int[]{1, 2, 3, 4, 5},
                        5,
                        3
                ).solution()
        );
    }

}
