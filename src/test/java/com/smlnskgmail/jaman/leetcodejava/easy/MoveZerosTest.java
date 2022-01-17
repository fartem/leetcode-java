package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MoveZerosTest {

    @Test
    public void defaultTest() {
        int[] input = new int[] {0, 1, 0, 3, 12};
        new MoveZeros(input).solution();
        assertArrayEquals(new int[] {1, 3, 12, 0, 0}, input);
    }
}
