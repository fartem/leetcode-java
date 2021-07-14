package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RemoveOneElementToMakeTheArrayStrictlyIncreasingTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new RemoveOneElementToMakeTheArrayStrictlyIncreasing(
                        new int[]{1, 2, 10, 5, 7}
                ).solution()
        );
    }

}
