package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NextGreaterElementITest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{-1, 3, -1},
                new NextGreaterElementI(
                        new int[]{4, 1, 2},
                        new int[]{1, 3, 4, 2}
                ).solution()
        );
    }

}
