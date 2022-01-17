package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SortArrayByParityIITest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[] {2, 7, 4, 5}, new SortArrayByParityII(new int[] {4, 2, 5, 7}).solution());
    }
}
