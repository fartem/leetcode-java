package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortArrayByParityIITest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[]{2, 7, 4, 5},
                new SortArrayByParityII(
                        new int[]{4, 2, 5, 7}
                ).solution()
        );
    }

}
