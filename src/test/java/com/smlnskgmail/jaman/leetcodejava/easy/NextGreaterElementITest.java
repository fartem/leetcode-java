package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class NextGreaterElementITest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[] {-1, 3, -1},
                new NextGreaterElementI(new int[] {4, 1, 2}, new int[] {1, 3, 4, 2}).solution());
    }
}
