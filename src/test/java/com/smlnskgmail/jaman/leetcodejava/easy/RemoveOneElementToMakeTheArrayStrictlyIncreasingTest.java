package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RemoveOneElementToMakeTheArrayStrictlyIncreasingTest {

    @Test
    public void defaultTest() {
        assertTrue(
                new RemoveOneElementToMakeTheArrayStrictlyIncreasing(new int[] {1, 2, 10, 5, 7})
                        .solution());
    }
}
