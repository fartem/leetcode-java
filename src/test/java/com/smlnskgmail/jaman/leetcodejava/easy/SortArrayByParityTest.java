package com.smlnskgmail.jaman.leetcodejava.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SortArrayByParityTest {

    @Test
    public void defaultTest() {
        assertArrayEquals(
                new int[] {2, 4, 3, 1}, new SortArrayByParity(new int[] {3, 1, 2, 4}).solution());
    }
}
