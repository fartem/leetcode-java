package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class DuplicateZerosTest {

    @Test
    public void defaultTest() {
        int[] input = new int[] {1, 0, 2, 3, 0, 4, 5, 0};
        new DuplicateZeros(input).solution();
        assertArrayEquals(new int[] {1, 0, 0, 2, 3, 0, 0, 4}, input);
    }
}
