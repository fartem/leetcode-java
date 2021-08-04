package com.smlnskgmail.jaman.leetcodejava.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateArrayTest {

    @Test
    public void defaultTest() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        new RotateArray(nums, 3).solution();
        assertArrayEquals(
                new int[]{5, 6, 7, 1, 2, 3, 4},
                nums
        );
    }

}
