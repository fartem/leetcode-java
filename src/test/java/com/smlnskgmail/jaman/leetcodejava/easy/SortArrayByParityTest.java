package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortArrayByParityTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{2, 4, 3, 1},
                new SortArrayByParity(
                        new int[]{3, 1, 2, 4}
                ).solution()
        );
    }

}
