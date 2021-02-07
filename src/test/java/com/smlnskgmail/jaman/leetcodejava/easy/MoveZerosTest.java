package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MoveZerosTest {

    @Test
    public void defaultTest() {
        int[] input = new int[]{0, 1, 0, 3, 12};
        new MoveZeros(input).solution();
        assertArrayEquals(
                new int[]{1, 3, 12, 0, 0},
                input
        );
    }

}
