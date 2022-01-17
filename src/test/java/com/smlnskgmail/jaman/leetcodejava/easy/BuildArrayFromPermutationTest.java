package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class BuildArrayFromPermutationTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[] {0, 1, 2, 4, 5, 3},
                new BuildArrayFromPermutation(new int[] {0, 2, 1, 5, 3, 4}).solution());
    }
}
