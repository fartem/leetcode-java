package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SingleThreadedCPUTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{0, 2, 3, 1},
                new SingleThreadedCPU(
                        new int[][]{{1, 2}, {2, 4}, {3, 2}, {4, 1}}
                ).solution()
        );
    }

}
