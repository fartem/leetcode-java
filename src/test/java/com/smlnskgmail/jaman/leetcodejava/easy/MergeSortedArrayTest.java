package com.smlnskgmail.jaman.leetcodejava.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortedArrayTest {

    @Test
    public void defaultTest() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        new MergeSortedArray(
                nums1,
                3,
                new int[]{2, 5, 6},
                3
        ).solution();
        assertArrayEquals(
                new int[]{1, 2, 2, 3, 5, 6},
                nums1
        );
    }

}
