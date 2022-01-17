package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SquaresOfASortedArrayTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[] {0, 1, 9, 16, 100},
                new SquaresOfASortedArray(new int[] {-4, -1, 0, 3, 10}).solution());
    }
}
